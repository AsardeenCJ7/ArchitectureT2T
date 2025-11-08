// PrototypeDemo.java
class Document implements Cloneable {
    private String title;
    private String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Document clone() {
        try {
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void show() {
        System.out.println("Title: " + title + " | Content: " + content);
    }
}

public class PrototypeDemo {
    public static void main(String[] args) {
        Document original = new Document("Design Patterns", "Covers 5 Creational Patterns.");
        Document copy = original.clone();

        copy.setContent("This is the cloned document.");

        System.out.println("Original:");
        original.show();

        System.out.println("Cloned:");
        copy.show();
    }
}
