package Main;

class Creator_Compiler{
    private  String language;
    public void setLanguage(String language){
        this.language = language;
    }
    public Compiler createCompiler(){
        if (language.equals("Java"))
            return new JavaCompiler();
        else if (language.equals("PHP"))
            return new PHPCompiler();
        else if (language.equals("JS"))
            return new JSCompiler();
        else if (language.equals("Pascal"))
            return new PascalCompiler();
        else return null;
    }
}

class Starter_Compiler{


    public void setFile(String path, Compiler compiler){
        compiler.setFile(path);
    }
    public void compile(Compiler compiler){
        compiler.run();
    }

}
