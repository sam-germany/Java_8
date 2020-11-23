package app_4_52;



class Widget {

    String data = "data";
    public void doWidgetStuff() {
      System.out.println(data);
    }

}

class GoodWidget extends Widget{
    String data = "big data";

    public void doWidgetStuff() {
    }
}

public class Test{
    public static void main(String[] args) {
        Widget w = new GoodWidget();
     System.out.println(w.data);
     
     System.out.println(((GoodWidget)w).data);
    }
   
}