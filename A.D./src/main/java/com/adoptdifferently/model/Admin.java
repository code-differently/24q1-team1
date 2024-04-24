public class Admin {

  private String username;
  private String password; 
  private UUID adminId; 

  public Admin(String username, String password, UUID adminId) {
    this.username = username;
    this.password = password;
    this.adminId = adminId;
  }
  // Getters and setters

  public UUID getAdminId() {
    return adminId;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public boolean isAdmin() {
    return true;
  }

}