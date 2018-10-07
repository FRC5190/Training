public class GreenHope extends Robot {
    @Override
    public void teleop() {
        super.teleop();
        System.out.println("Green Hope Teleop");
    }

    @Override
    public void autonomous() {
        super.autonomous();
        System.out.println("Green Hope Autonomous");
    }
}
