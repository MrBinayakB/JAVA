
class InvalidSemesterException extends Exception{
    public InvalidSemesterException(String msg){
        super(msg);
    }
}
class Student{
    String name;
    int sem;
    public Student(String name,int sem)throws InvalidSemesterException{
        if(sem<1 || sem>8){
            throw new InvalidSemesterException("Enter valid Semester");
        }else{
            this.name=name;
            this.sem=sem;
        }    
    }
    public void showInfo(){
        System.out.println("Name= "+this.name+" Sem= "+this.sem);
    }
}
class UserDefException{
    public static void main(String[]args){
        try{
            Student s=new Student("Binayak",8);
            s.showInfo();
        }catch(InvalidSemesterException e){
            System.out.println(e.getMessage());
        }
    }
}