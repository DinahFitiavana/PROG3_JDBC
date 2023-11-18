public class Author {
    private int authorId;
    private String authorName;
    private String sex;

    public Author(int authorId, String authorName, String sex) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.sex = sex;
    }

    public Author() {

    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
