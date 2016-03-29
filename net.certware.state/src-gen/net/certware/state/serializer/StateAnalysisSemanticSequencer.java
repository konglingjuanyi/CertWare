/*
 * generated by Xtext
 */
package net.certware.state.serializer;

import com.google.inject.Inject;
import java.util.Set;
import net.certware.state.services.StateAnalysisGrammarAccess;
import net.certware.state.stateAnalysis.Component;
import net.certware.state.stateAnalysis.Controller;
import net.certware.state.stateAnalysis.DataCollection;
import net.certware.state.stateAnalysis.DataProduct;
import net.certware.state.stateAnalysis.Deployment;
import net.certware.state.stateAnalysis.DeploymentSet;
import net.certware.state.stateAnalysis.Device;
import net.certware.state.stateAnalysis.DeviceCommand;
import net.certware.state.stateAnalysis.DeviceMeasurement;
import net.certware.state.stateAnalysis.Estimator;
import net.certware.state.stateAnalysis.HardwareAdapter;
import net.certware.state.stateAnalysis.HardwareCommand;
import net.certware.state.stateAnalysis.HardwareMeasurement;
import net.certware.state.stateAnalysis.QosPolicy;
import net.certware.state.stateAnalysis.StateAnalysisPackage;
import net.certware.state.stateAnalysis.StateConstraint;
import net.certware.state.stateAnalysis.StateUpdate;
import net.certware.state.stateAnalysis.StateVariable;
import net.certware.state.stateAnalysis.Subsystem;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class StateAnalysisSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private StateAnalysisGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == StateAnalysisPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case StateAnalysisPackage.COMPONENT:
				sequence_Component(context, (Component) semanticObject); 
				return; 
			case StateAnalysisPackage.CONTROLLER:
				sequence_Controller(context, (Controller) semanticObject); 
				return; 
			case StateAnalysisPackage.DATA_COLLECTION:
				sequence_DataCollection(context, (DataCollection) semanticObject); 
				return; 
			case StateAnalysisPackage.DATA_PRODUCT:
				sequence_DataProduct(context, (DataProduct) semanticObject); 
				return; 
			case StateAnalysisPackage.DEPLOYMENT:
				sequence_Deployment(context, (Deployment) semanticObject); 
				return; 
			case StateAnalysisPackage.DEPLOYMENT_SET:
				sequence_DeploymentSet(context, (DeploymentSet) semanticObject); 
				return; 
			case StateAnalysisPackage.DEVICE:
				sequence_Device(context, (Device) semanticObject); 
				return; 
			case StateAnalysisPackage.DEVICE_COMMAND:
				sequence_DeviceCommand(context, (DeviceCommand) semanticObject); 
				return; 
			case StateAnalysisPackage.DEVICE_MEASUREMENT:
				sequence_DeviceMeasurement(context, (DeviceMeasurement) semanticObject); 
				return; 
			case StateAnalysisPackage.ESTIMATOR:
				sequence_Estimator(context, (Estimator) semanticObject); 
				return; 
			case StateAnalysisPackage.HARDWARE_ADAPTER:
				sequence_HardwareAdapter(context, (HardwareAdapter) semanticObject); 
				return; 
			case StateAnalysisPackage.HARDWARE_COMMAND:
				sequence_HardwareCommand(context, (HardwareCommand) semanticObject); 
				return; 
			case StateAnalysisPackage.HARDWARE_MEASUREMENT:
				sequence_HardwareMeasurement(context, (HardwareMeasurement) semanticObject); 
				return; 
			case StateAnalysisPackage.QOS_POLICY:
				sequence_QosPolicy(context, (QosPolicy) semanticObject); 
				return; 
			case StateAnalysisPackage.STATE_CONSTRAINT:
				sequence_StateConstraint(context, (StateConstraint) semanticObject); 
				return; 
			case StateAnalysisPackage.STATE_UPDATE:
				sequence_StateUpdate(context, (StateUpdate) semanticObject); 
				return; 
			case StateAnalysisPackage.STATE_VARIABLE:
				sequence_StateVariable(context, (StateVariable) semanticObject); 
				return; 
			case StateAnalysisPackage.SUBSYSTEM:
				sequence_Subsystem(context, (Subsystem) semanticObject); 
				return; 
			case StateAnalysisPackage.SYSTEM:
				sequence_System(context, (net.certware.state.stateAnalysis.System) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Component returns Component
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING 
	 *         stateVariables+=StateVariable+ 
	 *         controllers+=Controller+ 
	 *         estimators+=Estimator+ 
	 *         adapters+=HardwareAdapter+
	 *     )
	 */
	protected void sequence_Component(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Controller returns Controller
	 *
	 * Constraint:
	 *     (name=ID description=STRING delegates+=[Controller|ID]* stateConstraint+=StateConstraint+ hardwareCommand+=HardwareCommand+)
	 */
	protected void sequence_Controller(ISerializationContext context, Controller semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataCollection returns DataCollection
	 *
	 * Constraint:
	 *     (name=ID description=STRING policies+=QosPolicy* products+=DataProduct*)
	 */
	protected void sequence_DataCollection(ISerializationContext context, DataCollection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataProduct returns DataProduct
	 *
	 * Constraint:
	 *     (name=ID description=STRING content=STRING)
	 */
	protected void sequence_DataProduct(ISerializationContext context, DataProduct semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.DATA_PRODUCT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.DATA_PRODUCT__NAME));
			if (transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.DATA_PRODUCT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.DATA_PRODUCT__DESCRIPTION));
			if (transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.DATA_PRODUCT__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.DATA_PRODUCT__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDataProductAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDataProductAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.accept(grammarAccess.getDataProductAccess().getContentSTRINGTerminalRuleCall_4_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DeploymentSet returns DeploymentSet
	 *
	 * Constraint:
	 *     (name=ID description=STRING deployments+=Deployment*)
	 */
	protected void sequence_DeploymentSet(ISerializationContext context, DeploymentSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Deployment returns Deployment
	 *
	 * Constraint:
	 *     (name=ID description=STRING components+=Component* catalogs+=DataCollection*)
	 */
	protected void sequence_Deployment(ISerializationContext context, Deployment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DeviceCommand returns DeviceCommand
	 *
	 * Constraint:
	 *     (name=ID description=STRING)
	 */
	protected void sequence_DeviceCommand(ISerializationContext context, DeviceCommand semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.DEVICE_COMMAND__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.DEVICE_COMMAND__NAME));
			if (transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.DEVICE_COMMAND__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.DEVICE_COMMAND__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeviceCommandAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDeviceCommandAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DeviceMeasurement returns DeviceMeasurement
	 *
	 * Constraint:
	 *     (name=ID description=STRING)
	 */
	protected void sequence_DeviceMeasurement(ISerializationContext context, DeviceMeasurement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.DEVICE_MEASUREMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.DEVICE_MEASUREMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.DEVICE_MEASUREMENT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.DEVICE_MEASUREMENT__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeviceMeasurementAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDeviceMeasurementAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Device returns Device
	 *
	 * Constraint:
	 *     (name=ID description=STRING deviceCommands+=DeviceCommand* deviceMeasurements+=DeviceMeasurement*)
	 */
	protected void sequence_Device(ISerializationContext context, Device semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Estimator returns Estimator
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING 
	 *         distilledMeasurements+=[Estimator|ID]* 
	 *         stateConstraints+=StateConstraint* 
	 *         stateUpdates+=StateUpdate+ 
	 *         hardwareMeasurement+=HardwareMeasurement+
	 *     )
	 */
	protected void sequence_Estimator(ISerializationContext context, Estimator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     HardwareAdapter returns HardwareAdapter
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING 
	 *         hardwareCommands+=HardwareCommand* 
	 *         hardwareMeasurements+=HardwareMeasurement* 
	 *         deviceCommands+=DeviceCommand* 
	 *         deviceMeasurements+=DeviceMeasurement*
	 *     )
	 */
	protected void sequence_HardwareAdapter(ISerializationContext context, HardwareAdapter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     HardwareCommand returns HardwareCommand
	 *
	 * Constraint:
	 *     (name=ID description=STRING)
	 */
	protected void sequence_HardwareCommand(ISerializationContext context, HardwareCommand semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.HARDWARE_COMMAND__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.HARDWARE_COMMAND__NAME));
			if (transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.HARDWARE_COMMAND__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.HARDWARE_COMMAND__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHardwareCommandAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getHardwareCommandAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     HardwareMeasurement returns HardwareMeasurement
	 *
	 * Constraint:
	 *     (name=ID description=STRING)
	 */
	protected void sequence_HardwareMeasurement(ISerializationContext context, HardwareMeasurement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.HARDWARE_MEASUREMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.HARDWARE_MEASUREMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.HARDWARE_MEASUREMENT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.HARDWARE_MEASUREMENT__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHardwareMeasurementAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getHardwareMeasurementAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     QosPolicy returns QosPolicy
	 *
	 * Constraint:
	 *     (name=ID description=STRING policy=STRING)
	 */
	protected void sequence_QosPolicy(ISerializationContext context, QosPolicy semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.QOS_POLICY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.QOS_POLICY__NAME));
			if (transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.QOS_POLICY__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.QOS_POLICY__DESCRIPTION));
			if (transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.QOS_POLICY__POLICY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.QOS_POLICY__POLICY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getQosPolicyAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getQosPolicyAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.accept(grammarAccess.getQosPolicyAccess().getPolicySTRINGTerminalRuleCall_4_0(), semanticObject.getPolicy());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StateConstraint returns StateConstraint
	 *
	 * Constraint:
	 *     (name=ID description=STRING)
	 */
	protected void sequence_StateConstraint(ISerializationContext context, StateConstraint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.STATE_CONSTRAINT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.STATE_CONSTRAINT__NAME));
			if (transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.STATE_CONSTRAINT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.STATE_CONSTRAINT__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStateConstraintAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStateConstraintAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StateUpdate returns StateUpdate
	 *
	 * Constraint:
	 *     (name=ID description=STRING)
	 */
	protected void sequence_StateUpdate(ISerializationContext context, StateUpdate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.STATE_UPDATE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.STATE_UPDATE__NAME));
			if (transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.STATE_UPDATE__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.STATE_UPDATE__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStateUpdateAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStateUpdateAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StateVariable returns StateVariable
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING 
	 *         representationType=StateRepresentationType 
	 *         inStateConstraints+=StateConstraint* 
	 *         outStateConstraints+=StateConstraint* 
	 *         stateUpdates+=StateUpdate* 
	 *         influencedBy+=StateVariable*
	 *     )
	 */
	protected void sequence_StateVariable(ISerializationContext context, StateVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Subsystem returns Subsystem
	 *
	 * Constraint:
	 *     (name=ID description=STRING deploymentSets+=DeploymentSet*)
	 */
	protected void sequence_Subsystem(ISerializationContext context, Subsystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     System returns System
	 *
	 * Constraint:
	 *     (name=ID description=STRING subsystems+=Subsystem*)
	 */
	protected void sequence_System(ISerializationContext context, net.certware.state.stateAnalysis.System semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}