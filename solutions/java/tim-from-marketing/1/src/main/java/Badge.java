class Badge {
    public String print(Integer id, String name, String department) {
        String deptStr = (department == null) ? "OWNER" : department.toUpperCase();
return (id == null) 
    ? String.format("%s - %s", name, deptStr)
    : String.format("[%d] - %s - %s", id, name, deptStr);
    }
}
