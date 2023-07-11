
public class Movie {
		// 여기에 필요한 코드를 작성하세요.  
    private String title, director;
    private Date viewDay;
    
    void setTitle(String title) { this.title = title; }
    void setDirector(String director) { this.director = director; }
    void setViewDay(Date viewDay) { this.viewDay = viewDay; }
    String getTitle() { return title; }
    String getDirector() { return director; }
    Date getViewDay() { return viewDay; }
    
    public Movie() {
        this("모름", "모름", new Date());
    }
    public Movie(String title, String director) {
        this(title, director, new Date());
    }
    public Movie(String title, String director, Date viewDay) {
        setTitle(title); setDirector(director);
        setViewDay(viewDay);
    }
    
    public String toString() {
        return getTitle() + " / " + getDirector() + " / " + getViewDay().toString();
    }
}