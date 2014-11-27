package Model;

import java.sql.Timestamp;

/**
 * Representation of comment
 * @author Riva Syafri Rachmatullah
 */
public class CommentofComment {
    private int id;
    private int cid;
    private int pid;
    private String name;
    private String email;
    private String content;
    private Timestamp time;
    
    /**
     * Create an instance of comment
     * @param id id of comment of comment
     * @param cid id of comment
     * @param pid id of post
     * @param name name of commentator
     * @param email email of commentator
     * @param content content of comment
     * @param time time taken
     */
    public CommentofComment(int id, int cid, int pid, String name, String email, String content, Timestamp time) {
        this.id = id;
        this.cid = cid;
        this.pid = pid;
        this.name = name;
        this.email = email;
        this.content = content;
        this.time = time;
    }
    
    /**
     * Get id of comment of comment
     * @return id of comment of comment
     */
    public int getID() {
        return id;
    }
    
    /**
     * Get id of comment
     * @return id of comment
     */
    public int getCID() {
        return cid;
    }
    
    /**
     * Get id of post
     * @return id of post
     */
    public int getPID() {
        return pid;
    }
    
    /**
     * Get name of commentator
     * @return name of commentator
     */
    public String getName() {
        return name;
    }
    
    /**
     * Get email of commentator
     * @return email of commentator
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Get content of comment
     * @return content of comment
     */
    public String getContent() {
        return content;
    }
    
    /**
     * Get time taken on comment
     * @return time taken on comment
     */
    public Timestamp getTime() {
        return time;
    }
    
    /**
     * Set id of comment of comment
     * @param id new id of comment of comment
     */
    public void setID(int id) {
        this.id = id;
    }
    
    /**
     * Set id of comment
     * @param cid new id of comment
     */
    public void setCID(int cid) {
        this.cid = cid;
    }
    
    /**
     * Set id of post
     * @param pid new id of post
     */
    public void setPID(int pid) {
        this.pid = pid;
    }
    
    /**
     * Set name of commentator
     * @param name new name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Set email of commentator
     * @param email new email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Set content of comment
     * @param content new content
     */
    public void setContent(String content) {
        this.content = content;
    }
    
    /**
     * Set time taken on comment
     * @param time new time of comment
     */
    public void setTime(Timestamp time) {
        this.time = time;
    }
}
