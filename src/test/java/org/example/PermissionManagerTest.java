package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermissionManagerTest {

    @Test
    public void test_getRoleName_ADMIN() {
        PermissionLevel permissionLevel = PermissionLevel.ADMIN;
        PermissionManager permissionManager = new PermissionManager();

        String roleName = permissionManager.getRoleName(permissionLevel);

        assertEquals("Admin", roleName);
    }

    @Test
    public void test_getRoleName_DEVELOPER() {
        PermissionLevel permissionLevel = PermissionLevel.DEVELOPER;
        PermissionManager permissionManager = new PermissionManager();

        String roleName = permissionManager.getRoleName(permissionLevel);

        assertEquals("Developer", roleName);
    }

    @Test
    public void test_getRoleName_USER() {
        PermissionLevel permissionLevel = PermissionLevel.USER;
        PermissionManager permissionManager = new PermissionManager();

        String roleName = permissionManager.getRoleName(permissionLevel);

        assertEquals("User", roleName);
    }

    @Test
    public void test_setPermissionLevel_ADMIN() {
        PermissionLevel permissionLevel = PermissionLevel.ADMIN;
        PermissionManager permissionManager = new PermissionManager();

        permissionManager.setPermissionLevel(permissionLevel);

        assertEquals(PermissionLevel.ADMIN, permissionManager.getCurrentPermissionLevel());
    }

    @Test
    public void test_setPermissionLevel_DEVELOPER() {
        PermissionLevel permissionLevel = PermissionLevel.DEVELOPER;
        PermissionManager permissionManager = new PermissionManager();

        permissionManager.setPermissionLevel(permissionLevel);

        assertEquals(PermissionLevel.DEVELOPER, permissionManager.getCurrentPermissionLevel());
    }

    @Test
    public void test_setPermissionLevel_USER() {
        PermissionLevel permissionLevel = PermissionLevel.USER;
        PermissionManager permissionManager = new PermissionManager();

        permissionManager.setPermissionLevel(permissionLevel);

        assertEquals(PermissionLevel.USER, permissionManager.getCurrentPermissionLevel());
    }

}
