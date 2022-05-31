public class Student {
    private String name;
    private String id;
    private String section;
    private int imageId;

    public Student(String name, String id, String section, int imageId) {
        this.name = name;
        this.id = id;
        this.section = section;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getSection() {
        return section;
    }

    public int getImageId() {
        return imageId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

}


//