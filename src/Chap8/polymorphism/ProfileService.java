package Chap8.polymorphism;

public class ProfileService {
    ProfileRepository repository;

//    public void saveProfile() {
//        repository = new ProfileDBRepository();
//        repository.save();
//    }
    public void saveProfile(ProfileRepository repository) {
        repository.save();
    }
}
