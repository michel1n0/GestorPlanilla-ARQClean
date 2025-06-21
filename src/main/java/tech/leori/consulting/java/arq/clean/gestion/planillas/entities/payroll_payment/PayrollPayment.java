package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.payroll_payment;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.enums.PaymentMethod;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.enums.PaymentStatus;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.generic.GenericDomain;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.payroll.IPayroll;

import java.time.LocalDate;

public class PayrollPayment extends GenericDomain {
    private final Long id;
    private final IPayroll payroll;
    private final LocalDate paymentDate;
    private final PaymentStatus status;
    private final PaymentMethod method;

    private PayrollPayment(Builder builder) {
        this.id = builder.id;
        this.payroll = builder.payroll;
        this.paymentDate = builder.paymentDate;
        this.status = builder.status;
        this.method = builder.method;
    }

    public static class Builder {
        private Long id;
        private IPayroll payroll;
        private LocalDate paymentDate;
        private PaymentStatus status;
        private PaymentMethod method;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder payroll(IPayroll payroll) {
            this.payroll = payroll;
            return this;
        }

        public Builder paymentDate(LocalDate paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }

        public Builder status(PaymentStatus status) {
            this.status = status;
            return this;
        }

        public Builder method(PaymentMethod method) {
            this.method = method;
            return this;
        }

        public PayrollPayment build() throws PayrollPaymentException {

            if (payroll == null) {
                throw new PayrollPaymentException("La Planilla es requerida para crear un Pago de Planilla.");
            }

            if (paymentDate == null) {
                throw new PayrollPaymentException("La Fecha de Pago es requerida para crear un Pago de Planilla.");
            }

            if (method == null) {
                throw new PayrollPaymentException("El Método de Pago es requerido para crear un Pago de Planilla.");
            }

            return new PayrollPayment(this);
        }
    }
}
