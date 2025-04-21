//завдання 1
class Report {
    private String title;
    private String content;

    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() { return title; }
    public String getContent() { return content; }
}

class ReportGenerator {
    public String generateReport(Report report) {
        return "Звіт: " + report.getTitle() + "\n" + report.getContent();
    }
}

class ReportSaver {
    public void saveToFile(String reportText) {
        System.out.println("Збережено у файл: \n" + reportText);
    }
}

class ReportSender {
    public void sendByEmail(String reportText) {
        System.out.println("Надіслано на email: \n" + reportText);
    }
}

class ReportManager {
    public void handleReport() {
        Report report = new Report("Щомісячний звіт", "Продажі зросли на 20%");
        ReportGenerator generator = new ReportGenerator();
        ReportSaver saver = new ReportSaver();
        ReportSender sender = new ReportSender();

        String reportText = generator.generateReport(report);
        saver.saveToFile(reportText);
        sender.sendByEmail(reportText);
    }
}

public class SRPExample {
    public static void main(String[] args) {
        new ReportManager().handleReport();
    }
}
