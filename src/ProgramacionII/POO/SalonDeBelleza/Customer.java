package ProgramacionII.POO.SalonDeBelleza;

public class Customer {
    private String name;
    private boolean member = false;
    private String memberType = "No";

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        String[] tipos = {"Premium", "Gold", "Silver"};
        for (String tipo : tipos) {
            if (tipo.equals(memberType)) {
                this.memberType = memberType;
                setMember(true);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Nombre: "+ name + ", Es miembro: " + memberType;
    }
}
