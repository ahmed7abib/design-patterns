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

public class BehaviouralPatterns {

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

        remoteControl.setCommand(tvTurnOn);
        remoteControl.buttonPressed();

        remoteControl.setCommand(tvTurnOff);
        remoteControl.buttonPressed();
    }
}