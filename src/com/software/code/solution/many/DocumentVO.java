package com.software.code.solution.many;

public class DocumentVO {
    private String documentId;
    private String title;
    private String body;
    private String author;
    private String date;
    public String getDocumentId() {
        return documentId;
    }
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "DocumentVO [documentId=" + documentId + ", title=" + title
                + ", body=" + body + ", author=" + author + ", date=" + date
                + "]";
    }
    
}