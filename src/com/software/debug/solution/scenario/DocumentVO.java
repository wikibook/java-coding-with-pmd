package com.software.debug.solution.scenario;

public class DocumentVO {

    private String docId;        //���� ���̵�
    
    private String title;            //���� ����
    
    private String body;            //���� ����
    
    private String author;        //�ۼ���

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
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
}