if(!user.getName().equals(user2.getName())){
    System.out.println("테스트 실패 (name)");
}
else if(!user.getPassword().equals(user2.getPassword())){
    System.out.println("테스트 실패 (password)");
}
else{
    System.out.println("테스트 성공");
}