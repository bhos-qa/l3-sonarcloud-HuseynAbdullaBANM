package org.example;

public class PermissionManager {
    private PermissionLevel mCurrentLevel = PermissionLevel.USER;

    public String getRoleName(PermissionLevel permissionLevel) {
        switch (permissionLevel) {
            case ADMIN:
                return "Admin";
            case DEVELOPER:
                return "Developer";
            case USER:
                return "User";
            default:
                throw new IllegalArgumentException("Invalid permission level" + permissionLevel);
        }
    }

    public void setPermissionLevel(PermissionLevel permissionLevel) {
        this.mCurrentLevel = permissionLevel;
    }

    public PermissionLevel getCurrentPermissionLevel() {
        return mCurrentLevel;
    }

    public static void main(String[] args) {
        PermissionManager permissionManager = new PermissionManager();

        // Get the role name for the current permission level
        String roleName = permissionManager.getRoleName(permissionManager.getCurrentPermissionLevel());
        System.out.println("Current role name:" + roleName);

        // Set the permission level to ADMIN
        permissionManager.setPermissionLevel(PermissionLevel.ADMIN);

        // Get the role name for the new permission level
        roleName = permissionManager.getRoleName(permissionManager.getCurrentPermissionLevel());
        System.out.println("New role name:" + roleName);
    }
}


