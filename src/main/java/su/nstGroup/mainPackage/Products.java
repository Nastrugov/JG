package su.nstGroup.mainPackage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

class Products {

    private DBWorker dbWorker;
    private ArrayList<Product> products;

    /*
    * Constructor starts a connection to the database
    * and initializes the store
    * */
    Products() {
        this.dbWorker = new DBWorker();
        this.products = new ArrayList<>();
        createProductFromDB();
    }

    /*
    * Adds a product to the repository
    *@param - Product
    */
    private void addProduct(Product product) {
        products.add(product);
    }

    /*
    * Creates a product from the database and adds it to the repository
    */
    private void createProductFromDB() {
        ResultSet rs = dbWorker.getResultSet("select * from knitted_products");
        try {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String material = rs.getString("material");
                String size = rs.getString("size");
                String color = rs.getString("color");
                float price = rs.getFloat("cost");
                String[] pictures = getPictures(rs.getString("pictures"));
                boolean presence = isPresence(rs.getString("presence"));
                addProduct(new Product(id, name, material, size, color, price, pictures, presence));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbWorker.close();
        }
    }

    /*
    *  Processes the string into an array of strings,
    *  each string is the name of the image file
    */
   private String[] getPictures(String pictures){
        String[] pics = pictures.split(",");
        String[] trimPics = new String[pics.length];
        for(int i = 0; i < pics.length; i++) {
            trimPics[i] = pics[i].trim();
        }
        return trimPics;
    }

    /*
    *  Converts a string to a boolean value
    */
    private boolean isPresence(String presence){
       return presence.equals("1");
    }
/*
* Gets the instance Product by ID
* */
    Product getProductById(int id){
        for(Product product : products){
            if(product.getId() == id) return product;
        }
        return null;
    }

    /*
    * Represents the storage in the form of HTML code
    */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("");
        for(Product product : products){
            sb.append(product);
            sb.append("\n");
        }
        return sb.toString();
    }
}
