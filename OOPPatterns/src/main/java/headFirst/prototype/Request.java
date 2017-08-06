package prototype;

//реализуем Cloneable
public class Request implements Cloneable {
    private String clientName;
    private int Age;
    private String job;

    public Request(String clientName, int age, String job) {
        this.clientName = clientName;
        Age = age;
        this.job = job;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    // переопределяем clone, возвращая супер класс
    public Request clone() throws CloneNotSupportedException {
        return (Request) super.clone();
    }

    public String toString() {
        return "clientName:" + clientName+ " Age: " + Age + " Job: "+ job;
    }
}
