package helper.halis.com.gsondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //json--->class

        Gson  gson=new Gson();

        Product p = gson.fromJson(json,Product.class);
        System.out.println(p.toString());


    }


    private final static String json="{\n" +
            "    \"id\": \"11298\",\n" +
            "    \"title\": \"رۇستەم ئاق سوقماقلىرى\",\n" +
            "    \"price\": \"75.00\",\n" +
            "    \"img\": \"http://static.bayram.cn/2016/03/30/20160330085409875_400x400.jpg\",\n" +
            "    \"sale\": \"1\"\n" +
            "}";

    public class Product {


        private String id;
        private String title;
        private String price;
        private String img;
        private String sale;

        @Override
        public String toString() {
            return "Product{" +
                    "id='" + id + '\'' +
                    ", title='" + title + '\'' +
                    ", price='" + price + '\'' +
                    ", img='" + img + '\'' +
                    ", sale='" + sale + '\'' +
                    '}';
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getSale() {
            return sale;
        }

        public void setSale(String sale) {
            this.sale = sale;
        }
    }

}
