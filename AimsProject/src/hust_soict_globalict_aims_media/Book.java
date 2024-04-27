
package hust_soict_globalict_aims_media;
import java.util.ArrayList;
import java.lang.Object;
import java.util.List;
import hust_soict_globalict_aims_media.*;


    public class Book extends Media{
        private List<String> authors = new ArrayList<>();
        public Book(int id, String title, String category, float cost){
            super(id, title, category, cost);
        }
        public List<String> getAuthors(){
            return authors;
        }

        public boolean isMatch(String title){
            return this.getTitle().equals(title);
        }
        
        public String toString() {
            return getTitle() + "-"+getCategory()+ "-"+getCost();
        }


    public void addAuthor(String authorName){
        if (!authors.contains(authorName)){
            authors.add(authorName);
            System.out.println("Add author sucessfully");
        }
        else {
            System.out.println("Author already exists");
        }
    }

    public void removeAuthor(String authorName){
        if(authors.contains(authorName)){
            authors.remove(authorName);
            System.out.println("Remove author sucessfully");
        }
        else {
            System.out.println("Author not exists");
        }
    }

}
