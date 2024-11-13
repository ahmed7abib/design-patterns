package behaviourals_patterns;

import behaviourals_patterns.chain_of_responsbility.form.FormRequest;
import behaviourals_patterns.chain_of_responsbility.form.ManagerEvaluation;
import behaviourals_patterns.chain_of_responsbility.form.SuperHeadEvaluation;
import behaviourals_patterns.chain_of_responsbility.hr_evalution.HREvaluationHandler;
import behaviourals_patterns.chain_of_responsbility.hr_evalution.JobApplication;
import behaviourals_patterns.chain_of_responsbility.hr_evalution.TechnicalEvaluationHandler;
import behaviourals_patterns.command.command.Command;
import behaviourals_patterns.command.RemoteControlInvoker;
import behaviourals_patterns.command.receiver.IReceiver;
import behaviourals_patterns.command.receiver.TVReceiver;
import behaviourals_patterns.command.command.TurnOffTelevision;
import behaviourals_patterns.command.command.TurnOnTelevision;
import behaviourals_patterns.observer.Course;
import behaviourals_patterns.observer.Student;
import behaviourals_patterns.state.vedio_player.VideoPlayer;
import behaviourals_patterns.strategy.Chevrolet;
import behaviourals_patterns.strategy.Mechanic;
import behaviourals_patterns.strategy.StrategyAlgo;
import behaviourals_patterns.strategy.Toyota;
import behaviourals_patterns.visitor.Tax;
import behaviourals_patterns.visitor.taxes.CustomsTax;
import behaviourals_patterns.visitor.taxes.SalesTax;
import behaviourals_patterns.visitor.taxes.ServiceAddedTax;
import behaviourals_patterns.visitor.wares.Banana;
import behaviourals_patterns.visitor.wares.Car;
import behaviourals_patterns.visitor.wares.Chair;
import behaviourals_patterns.visitor.wares.Ware;

import java.util.ArrayList;
import java.util.List;

public class BPDemos {

    public static void coRDemo() {
        System.out.println("Example 1");

        JobApplication jobApplication = new JobApplication();
        jobApplication.setJobCode("1210131");
        jobApplication.setJobTitle("Android Developer");
        // jobApplication.setApplicationName("Ahmed");

        HREvaluationHandler hrEvaluationHandler = new HREvaluationHandler();
        TechnicalEvaluationHandler technicalEvaluationHandler = new TechnicalEvaluationHandler();
        technicalEvaluationHandler.setNextHandler(hrEvaluationHandler);

        technicalEvaluationHandler.handleRequest(jobApplication);

        System.out.println(jobApplication.getComments());

        System.out.println("Example 2 \n");

        FormRequest formRequest = new FormRequest();
        formRequest.setFormName("Mobile Team Evaluation");

        ManagerEvaluation managerEvaluation = new ManagerEvaluation();
        SuperHeadEvaluation superHeadEvaluation = new SuperHeadEvaluation();
        managerEvaluation.setNextHandler(superHeadEvaluation);

        managerEvaluation.handleRequest(formRequest);

        System.out.println(formRequest);
    }

    public static void observerDemo() {

        Student ahmed = new Student("Ahmed");
        Student mohamed = new Student("Mohamed");

        Course php = new Course("PHP");
        Course java = new Course("JAVA");

        php.subscribe(ahmed);
        php.subscribe(mohamed);
        java.subscribe(mohamed);

        php.setAvailability(true);
        java.setAvailability(false);
    }

    public static void strategyDemo() {

        StrategyAlgo toyota = new Toyota();
        StrategyAlgo chev = new Chevrolet();

        Mechanic mechanic = new Mechanic();

        mechanic.setStrategyAlgo(toyota);
        mechanic.disassembleCar();

        mechanic.setStrategyAlgo(chev);
        mechanic.disassembleCar();
    }

    public static void stateDemo() {
        VideoPlayer videoPlayer = new VideoPlayer();

        videoPlayer.processVideo();
        videoPlayer.processVideo();
        videoPlayer.processVideo();

        videoPlayer.processVideo();
        videoPlayer.processVideo();
        videoPlayer.processVideo();
    }

    public static void commandDemo() {
        IReceiver tvReceiver = new TVReceiver();
        RemoteControlInvoker remoteControl = new RemoteControlInvoker();

        Command tvTurnOn = new TurnOnTelevision(tvReceiver);
        Command tvTurnOff = new TurnOffTelevision(tvReceiver);

        remoteControl.buttonPressed(tvTurnOn);
        remoteControl.undo();

        remoteControl.buttonPressed(tvTurnOff);
    }

    public static void visitorDemo() {
        Ware car = new Car(500_000);
        Ware banana = new Banana(25);
        Ware chair = new Chair(700);

        List<Tax> taxList = new ArrayList<>();
        taxList.add(new SalesTax());
        taxList.add(new CustomsTax());
        taxList.add(new ServiceAddedTax());

        System.out.println("Car price without tax = " + car.getPrice());
        car.addTaxList(taxList);
        System.out.println("Car price with tax = " + car.getPrice());

        System.out.println("Banana price without tax = " + banana.getPrice());
        banana.addTaxList(taxList);
        System.out.println("Banana price with tax = " + banana.getPrice());

        System.out.println("Chair price without tax = " + chair.getPrice());
        chair.addWareTax(new SalesTax());
        System.out.println("Banana price with tax = " + chair.getPrice());
    }
}