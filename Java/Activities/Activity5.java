abstract class Book {
        String title;
        //Abstract method
        abstract void setTitle(String s);
        String getTitle() {
            return title;
        }
    }

    class MyBook extends Book {
        //Define abstract method
        public void setTitle(String s) {
            title = s;
        }
    }

    public class Activity5 {

        public static void main(String []args) {
            //Initialize title of the book
            String title = "The Secret Garden";
            //Create object for MyBook
            Book newNovel = new MyBook();
            newNovel.setTitle(title);
            System.out.println("The title is: " + newNovel.getTitle());
        }
    }

