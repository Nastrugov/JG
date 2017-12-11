package su.nstGroup.mainPackage;

class Product {
    private int id;
    private String name;
    private String material;
    private String size;
    private String colors;
    private float price;
    private String[] pictures;
    private boolean presence;

    Product(int id, String name, String material, String size, String colors, float price, String[] pictures, boolean presence) {
        this.id = id;
        this.name = name;
        this.material = material;
        this.size = size;
        this.colors = colors;
        this.price = price;
        this.pictures = pictures;
        this.presence = presence;
    }
/* Getters */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }

    public String getColors() {
        return colors;
    }

    public float getPrice() {
        return price;
    }

    public String[] getPictures() {
        return pictures;
    }
    public boolean isPresence() {
        return presence;
    }
/*
* Converts a Boolean value to a string with the desired content
* @param boolean
*/
    private String getPresence(boolean presence){
        if(presence) return "В наличии.";
        else return "Под заказ.";
    }
/*
*Returns a string in the form HTML code options
*/
    public String toHTMLString() {
        String htmlCode = String.format("<div class=\"card\">\n" +
                "\t\t\t<img tabindex=\"0\" \"src=\"pictures/%1s\" alt=\"Фото изделия\">\n" +
                "\t\t\t<p>Номер в каталоге:<span> %2d</span></p>\n" +
                "\t\t\t<p>Наименование:<span> %3s</span></p>\n" +
                "\t\t\t<p>Материал:<span> %4s</span></p>\n" +
                "\t\t\t<p>Размеры:<span> %5s</span></p>\n" +
                "\t\t\t<p>Расцветки:<span> %6s</span></p>\n" +
                "\t\t\t<p>Стоимость от:<span> %7.2f</span></p>\n" +
                "\t\t\t<p><span> %8s</span></p>\n" +
                "\t\t\t<p class=\"lastp\"><a href=\"/productServlet?from=%d\">Подробнее...</a></p>\n" +
                "\t\t</div>", getPictures()[0], getId(), getName(), getMaterial(), getSize(), getColors(), getPrice(), getPresence(isPresence()), getId());

    if(htmlCode != null) return htmlCode;
    else return "div class=\"card\">Товара не существует.</div>";
    }
}
