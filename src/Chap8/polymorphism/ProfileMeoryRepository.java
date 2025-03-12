package Chap8.polymorphism;

public class ProfileMeoryRepository implements ProfileRepository{
    @Override
    public void save() {
        System.out.println("메모리에 프로필 저장");
    }
}
