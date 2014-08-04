package com.software.design.solution.sde;

public class SwitchDensityExample {

    public static final  int NONE			= -1;
    public static final  int ETNEWS		= 0;
    public static final int ZDNET			= 1;
    public static final int NEWS_COM1	= 2;
    public static final int NEWS_COM2	= 3;
    public static final int NEWS_COM3	= 4;
    
    public static void main(String[] args) {
        int type = args != null ? Integer.parseInt(args[0]) : NONE;
        
        String path = args != null && args.length == 2 ? args[1] : null;
        
        SwitchDensityExample example = new SwitchDensityExample();
        example.getNewsData(type, path);
        
    }
    
    
    public void getNewsData(int type, String path) {
        switch(type) {
        case ETNEWS :
            //case절의 복잡도는 자체는 줄어들었지만 전체적인 
            //클래스의 복잡도는 그대로 이거나 때로는 더욱 증가한다. 
            saveEtNews(path);
            break;
        case ZDNET :
            saveZdNews(path);
            break;
        case NEWS_COM1 :
        	/*
        	 * 코드 생략...
        	 */
        	break;
        case NEWS_COM2 :
        	/*
        	 * 코드 생략...
        	 */
        	break;
        case NEWS_COM3 :
        	/*
        	 * 코드 생략...
        	 */
        	break;
        default :
            break;
            
        }
    }
    
    public void saveEtNews(String path) {
        NewsVO newsVO = null;
        String title;
        String body;
        String author;
        String date;
        String email;
        String news;
        if(isEnable(path)) {
            news = getNews(path);
            title = getEtNewsTitle(news);
            body = getEtNewsBody(news);
            author = getEtAuthor(news);
            date = getEtDate(news);
            email = getEtEmail(news);
            newsVO =  new NewsVO(title,body,author,date,email);
            storeNews(newsVO);
        }
    }
    
    public void saveZdNews(String path){
    	NewsVO newsVO = null;
    	String title;
        String body;
        String author;
        String date;
        String email;
        String news;
        if(isEnable(path)) {
            news = getNews(path);
            title = getZdNewsTitle(news);
            body = getZdNewsBody(news);
            author = getZdAuthor(news);
            date = getZdDate(news);
            email = getZdEmail(news);
            newsVO =  new NewsVO(title,body,author,date,email);
            storeNews(newsVO);
        }
    }
    
    public boolean isEnable(String path) {return true;}
    public String getNews(String path) {return null;}
    
    public String getEtNewsTitle(String news) {return null;}
    
    public String getEtNewsBody(String news) {return null;}
    
    public String getEtAuthor(String path) {return null;}
    
    public String getEtDate(String path) {return null;}
    
    public String getEtEmail(String path) {return null;}
    
    public String getZdNewsTitle(String news) {return null;}
    
    public String getZdNewsBody(String news) {return null;}
    
    public String getZdAuthor(String path) {return null;}
    
    public String getZdDate(String path) {return null;}
    
    public String getZdEmail(String path) {return null;}
    
    public void storeNews(NewsVO newsVO) {}

}