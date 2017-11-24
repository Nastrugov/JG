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

    private String getPresence(boolean presence){
        if(presence) return "В наличии.";
        else return "Под заказ.";
    }

    @Override
    public String toString() {
        String htmlCode = String.format("<div class=\"card\">\n" +
                "\t\t\t<img tabindex=\"0 \"src=\"pictures/%s\" alt=\"Фото изделия\">\n" +
                "\t\t\t<p>Номер в каталоге:<span> %d</span></p>\n" +
                "\t\t\t<p>Наименование:<span> %s</span></p>\n" +
                "\t\t\t<p>Материал:<span> %s</span></p>\n" +
                "\t\t\t<p>Размеры:<span> %s</span></p>\n" +
                "\t\t\t<p>Расцветки:<span> %s</span></p>\n" +
                "\t\t\t<p>Стоимость от:<span> %.2f</span></p>\n" +
                "\t\t\t<p><span> %s</span></p>\n" +
                "\t\t\t<p class=\"lastp\"><a href=\"#\">Подробнее...</a></p>\n" +
                "\t\t</div>", getPictures()[0], getId(), getName(), getMaterial(), getSize(), getColors(), getPrice(),  getPresence(isPresence()));

    if(htmlCode != null) return htmlCode;
    else return "div class=\"card\">Товара не существует.</div>";
    }
}
