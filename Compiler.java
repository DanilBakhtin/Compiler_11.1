package Main;

/**
 * Абстрактный класс Компилятор
 */
public abstract class Compiler {

    /**
     * Исходный код
     */
    private String startCode;
    /**
     * Машинный код
     */
    private String machineCode;
    /**
     * Путь к файлу
     */
    private String path;

    public void setFile(String path){
        this.path = path;
    }

    //пуск компиляции
    public void run(){
        System.out.println("Загружен файл: " + path);
        lexicalAnalysis();
        syntacticAnalysis();
        semanticAnalysis();
        errorsMessage();
        machineCode();
    }


    /**
     * Абстрактные методы класса
     */
    //лекцический анализ
    public abstract void lexicalAnalysis();

    //синтаксический анализ(парсинг)
    public abstract void syntacticAnalysis();

    //семантический анализ
    public abstract void semanticAnalysis();

    //Машинный код
    public abstract void machineCode();

    //Сообщения об ошибках
    public abstract void errorsMessage();

}
