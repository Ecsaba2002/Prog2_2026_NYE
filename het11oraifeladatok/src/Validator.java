class Validator {

    public void checkPassword(String pwd) throws InvalidPasswordException {
        if (pwd == null || pwd.length() < 8) {
            throw new InvalidPasswordException("A jelszó túl rövid! Minimum 8 karakter szükséges.");
        }
        System.out.println("A jelszó megfelelő.");
    }
}
