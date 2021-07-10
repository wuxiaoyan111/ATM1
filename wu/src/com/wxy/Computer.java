package com.wxy;

public class Computer {
       private String price;
       private String type;
       private  String color;

       public String getPrice() {
              return price;
       }

       public void setPrice(String price) {
              this.price = price;
       }

       public String getType() {
              return type;
       }

       public void setType(String type) {
              this.type = type;
       }

       public String getColor() {
              return color;
       }

       public void setColor(String color) {
              this.color = color;
       }

       @Override
       public String toString() {
              return "Computer{" +
                      "price='" + price + '\'' +
                      ", type='" + type + '\'' +
                      ", color='" + color + '\'' +
                      '}';
       }
}
