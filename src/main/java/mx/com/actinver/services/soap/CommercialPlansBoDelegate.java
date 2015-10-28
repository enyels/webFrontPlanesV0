/**
 * CommercialPlansBoDelegate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.services.soap;

public interface CommercialPlansBoDelegate extends java.rmi.Remote {
    public mx.com.actinver.services.soap.PlansDtoRs findPlansByIdContract(mx.com.actinver.services.soap.PlansDtoRq plansDtoRq) throws java.rmi.RemoteException;
    public mx.com.actinver.services.soap.PlanesDtoRs getPlansByContract(java.lang.String idContract) throws java.rmi.RemoteException;
    public mx.com.actinver.services.soap.PlanesDtoRs getAllPlans() throws java.rmi.RemoteException;
    public mx.com.actinver.services.soap.PlanDtoRs getPlanById(java.lang.String idPlan) throws java.rmi.RemoteException;
    public mx.com.actinver.services.soap.PlanDtoRs savePlan(mx.com.actinver.services.soap.PlanDetDtoRq plan) throws java.rmi.RemoteException;
    public mx.com.actinver.services.soap.PlanDtoRs updatePlanById(mx.com.actinver.services.soap.PlansUpdateDtoRq plan) throws java.rmi.RemoteException;
    public mx.com.actinver.services.soap.PlanDtoRs desactivePlanById(mx.com.actinver.services.soap.PlansDesactiveDtoRq plan) throws java.rmi.RemoteException;
}
