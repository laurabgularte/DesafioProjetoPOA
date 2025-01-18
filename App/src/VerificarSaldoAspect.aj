import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;

@Aspect
public class VerificarSaldoAspect {
    @Before("execution(* ContaBancaria.sacar(double)) && args(valor)")
    public void verificaSaldo(JoinPoint joinPoint, double valor) {
        ContaBancaria conta = (ContaBancaria) joinPoint.getTarget();
        if (conta.saldo < valor) {
            System.out.println("Saldo insuficiente!");
           
        }
    }
}