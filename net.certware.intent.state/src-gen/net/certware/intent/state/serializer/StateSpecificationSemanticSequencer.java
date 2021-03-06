/*
 * generated by Xtext
 */
package net.certware.intent.state.serializer;

import com.google.inject.Inject;
import java.util.Set;
import net.certware.intent.state.services.StateSpecificationGrammarAccess;
import net.certware.intent.state.stateSpecification.BigUnitValue;
import net.certware.intent.state.stateSpecification.Component;
import net.certware.intent.state.stateSpecification.ComponentInput;
import net.certware.intent.state.stateSpecification.ComponentOutput;
import net.certware.intent.state.stateSpecification.Device;
import net.certware.intent.state.stateSpecification.DeviceInput;
import net.certware.intent.state.stateSpecification.DeviceOutput;
import net.certware.intent.state.stateSpecification.Input;
import net.certware.intent.state.stateSpecification.Mode;
import net.certware.intent.state.stateSpecification.ModeElement;
import net.certware.intent.state.stateSpecification.ModeElementType;
import net.certware.intent.state.stateSpecification.ModeVariable;
import net.certware.intent.state.stateSpecification.Output;
import net.certware.intent.state.stateSpecification.Specification;
import net.certware.intent.state.stateSpecification.State;
import net.certware.intent.state.stateSpecification.StateElement;
import net.certware.intent.state.stateSpecification.StateList;
import net.certware.intent.state.stateSpecification.StateSpecificationPackage;
import net.certware.intent.state.stateSpecification.StateValue;
import net.certware.intent.state.stateSpecification.StateVariable;
import net.certware.intent.state.stateSpecification.Trigger;
import net.certware.intent.state.stateSpecification.TriggerTable;
import net.certware.intent.state.stateSpecification.ValueList;
import net.certware.intent.state.stateSpecification.ValueRange;
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
public class StateSpecificationSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private StateSpecificationGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == StateSpecificationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case StateSpecificationPackage.BIG_UNIT_VALUE:
				sequence_BigUnitValue(context, (BigUnitValue) semanticObject); 
				return; 
			case StateSpecificationPackage.COMPONENT:
				sequence_Component(context, (Component) semanticObject); 
				return; 
			case StateSpecificationPackage.COMPONENT_INPUT:
				sequence_ComponentInput(context, (ComponentInput) semanticObject); 
				return; 
			case StateSpecificationPackage.COMPONENT_OUTPUT:
				sequence_ComponentOutput(context, (ComponentOutput) semanticObject); 
				return; 
			case StateSpecificationPackage.DEVICE:
				sequence_Device(context, (Device) semanticObject); 
				return; 
			case StateSpecificationPackage.DEVICE_INPUT:
				sequence_DeviceInput(context, (DeviceInput) semanticObject); 
				return; 
			case StateSpecificationPackage.DEVICE_OUTPUT:
				sequence_DeviceOutput(context, (DeviceOutput) semanticObject); 
				return; 
			case StateSpecificationPackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case StateSpecificationPackage.MODE:
				sequence_Mode(context, (Mode) semanticObject); 
				return; 
			case StateSpecificationPackage.MODE_ELEMENT:
				sequence_ModeElement(context, (ModeElement) semanticObject); 
				return; 
			case StateSpecificationPackage.MODE_ELEMENT_TYPE:
				sequence_ModeElementType(context, (ModeElementType) semanticObject); 
				return; 
			case StateSpecificationPackage.MODE_VARIABLE:
				sequence_ModeVariable(context, (ModeVariable) semanticObject); 
				return; 
			case StateSpecificationPackage.OUTPUT:
				sequence_Output(context, (Output) semanticObject); 
				return; 
			case StateSpecificationPackage.SPECIFICATION:
				sequence_Specification(context, (Specification) semanticObject); 
				return; 
			case StateSpecificationPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case StateSpecificationPackage.STATE_ELEMENT:
				sequence_StateElement(context, (StateElement) semanticObject); 
				return; 
			case StateSpecificationPackage.STATE_LIST:
				sequence_StateList(context, (StateList) semanticObject); 
				return; 
			case StateSpecificationPackage.STATE_VALUE:
				sequence_StateValue(context, (StateValue) semanticObject); 
				return; 
			case StateSpecificationPackage.STATE_VARIABLE:
				sequence_StateVariable(context, (StateVariable) semanticObject); 
				return; 
			case StateSpecificationPackage.TRIGGER:
				sequence_Trigger(context, (Trigger) semanticObject); 
				return; 
			case StateSpecificationPackage.TRIGGER_TABLE:
				sequence_TriggerTable(context, (TriggerTable) semanticObject); 
				return; 
			case StateSpecificationPackage.VALUE_LIST:
				sequence_ValueList(context, (ValueList) semanticObject); 
				return; 
			case StateSpecificationPackage.VALUE_RANGE:
				sequence_ValueRange(context, (ValueRange) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     BigUnitValue returns BigUnitValue
	 *
	 * Constraint:
	 *     (value=BigDecimalType units=STRING)
	 */
	protected void sequence_BigUnitValue(ISerializationContext context, BigUnitValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateSpecificationPackage.Literals.BIG_UNIT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateSpecificationPackage.Literals.BIG_UNIT_VALUE__VALUE));
			if (transientValues.isValueTransient(semanticObject, StateSpecificationPackage.Literals.BIG_UNIT_VALUE__UNITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateSpecificationPackage.Literals.BIG_UNIT_VALUE__UNITS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBigUnitValueAccess().getValueBigDecimalTypeParserRuleCall_0_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getBigUnitValueAccess().getUnitsSTRINGTerminalRuleCall_2_0(), semanticObject.getUnits());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentInput returns ComponentInput
	 *
	 * Constraint:
	 *     (name=ID io=Input? source=[Device|ID])
	 */
	protected void sequence_ComponentInput(ISerializationContext context, ComponentInput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComponentOutput returns ComponentOutput
	 *
	 * Constraint:
	 *     (name=ID io=Output? target=[Device|ID])
	 */
	protected void sequence_ComponentOutput(ISerializationContext context, ComponentOutput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Component returns Component
	 *
	 * Constraint:
	 *     (name=ID modes+=ModeElement* states+=StateElement* inputs+=ComponentInput* outputs+=ComponentOutput*)
	 */
	protected void sequence_Component(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DeviceInput returns DeviceInput
	 *
	 * Constraint:
	 *     (name=ID io=Input? source=[Component|ID])
	 */
	protected void sequence_DeviceInput(ISerializationContext context, DeviceInput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DeviceOutput returns DeviceOutput
	 *
	 * Constraint:
	 *     (name=ID io=Output? target=[Component|ID])
	 */
	protected void sequence_DeviceOutput(ISerializationContext context, DeviceOutput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Device returns Device
	 *
	 * Constraint:
	 *     (name=ID desc=STRING inputs+=DeviceInput* outputs+=DeviceOutput*)
	 */
	protected void sequence_Device(ISerializationContext context, Device semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Input returns Input
	 *
	 * Constraint:
	 *     (
	 *         range=ValueRange? 
	 *         valueList=ValueList? 
	 *         valueHandling=STRING? 
	 *         granularity=BigUnitValue? 
	 *         arrivalRateAvg=BigUnitValue? 
	 *         arrivalRateMinimum=BigUnitValue? 
	 *         arrivalRateMaximum=BigUnitValue? 
	 *         obsolescence=BigUnitValue? 
	 *         references=STRING? 
	 *         appearsIn=STRING? 
	 *         description=STRING? 
	 *         comments=STRING? 
	 *         structure=TriggerTable?
	 *     )
	 */
	protected void sequence_Input(ISerializationContext context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModeElementType returns ModeElementType
	 *
	 * Constraint:
	 *     (elementType='supervisory' | elementType='operating' | elementType='other')
	 */
	protected void sequence_ModeElementType(ISerializationContext context, ModeElementType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModeElement returns ModeElement
	 *
	 * Constraint:
	 *     (inferred?='inferred'? type=ModeElementType modes+=ModeVariable+)
	 */
	protected void sequence_ModeElement(ISerializationContext context, ModeElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModeVariable returns ModeVariable
	 *
	 * Constraint:
	 *     (desc=STRING modes+=Mode+)
	 */
	protected void sequence_ModeVariable(ISerializationContext context, ModeVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Mode returns Mode
	 *
	 * Constraint:
	 *     (initial?='initial'? value=STRING)
	 */
	protected void sequence_Mode(ISerializationContext context, Mode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Output returns Output
	 *
	 * Constraint:
	 *     (
	 *         range=ValueRange? 
	 *         valueList=ValueList? 
	 *         rate=BigUnitValue? 
	 *         delay=BigUnitValue? 
	 *         deadline=BigUnitValue? 
	 *         completionHandling=STRING? 
	 *         variables=STRING? 
	 *         relationship=STRING? 
	 *         minResponse=BigUnitValue? 
	 *         maxResponse=BigUnitValue? 
	 *         feebackHandling=STRING? 
	 *         reversed=STRING? 
	 *         references=STRING? 
	 *         comments=STRING? 
	 *         contents=STRING? 
	 *         table=TriggerTable?
	 *     )
	 */
	protected void sequence_Output(ISerializationContext context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Specification returns Specification
	 *
	 * Constraint:
	 *     (name=ID devices+=Device* components+=Component+)
	 */
	protected void sequence_Specification(ISerializationContext context, Specification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StateElement returns StateElement
	 *
	 * Constraint:
	 *     (inferred?='inferred'? states+=StateVariable+)
	 */
	protected void sequence_StateElement(ISerializationContext context, StateElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StateList returns StateList
	 *
	 * Constraint:
	 *     stateList+=StateValue+
	 */
	protected void sequence_StateList(ISerializationContext context, StateList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StateValue returns StateValue
	 *
	 * Constraint:
	 *     (value='T' | value='F' | value='.' | value='?')
	 */
	protected void sequence_StateValue(ISerializationContext context, StateValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StateVariable returns StateVariable
	 *
	 * Constraint:
	 *     (desc=STRING state+=State+)
	 */
	protected void sequence_StateVariable(ISerializationContext context, StateVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (initial?='initial'? value=STRING)
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TriggerTable returns TriggerTable
	 *
	 * Constraint:
	 *     rows+=Trigger*
	 */
	protected void sequence_TriggerTable(ISerializationContext context, TriggerTable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Trigger returns Trigger
	 *
	 * Constraint:
	 *     ((mode=[Mode|ID] list=StateList) | (variable=[StateVariable|ID] value=[State|ID] list=StateList))
	 */
	protected void sequence_Trigger(ISerializationContext context, Trigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ValueList returns ValueList
	 *
	 * Constraint:
	 *     values+=STRING+
	 */
	protected void sequence_ValueList(ISerializationContext context, ValueList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ValueRange returns ValueRange
	 *
	 * Constraint:
	 *     (lower=BigDecimalType upper=BigDecimalType rangeType=STRING rangeUnits=STRING)
	 */
	protected void sequence_ValueRange(ISerializationContext context, ValueRange semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateSpecificationPackage.Literals.VALUE_RANGE__LOWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateSpecificationPackage.Literals.VALUE_RANGE__LOWER));
			if (transientValues.isValueTransient(semanticObject, StateSpecificationPackage.Literals.VALUE_RANGE__UPPER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateSpecificationPackage.Literals.VALUE_RANGE__UPPER));
			if (transientValues.isValueTransient(semanticObject, StateSpecificationPackage.Literals.VALUE_RANGE__RANGE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateSpecificationPackage.Literals.VALUE_RANGE__RANGE_TYPE));
			if (transientValues.isValueTransient(semanticObject, StateSpecificationPackage.Literals.VALUE_RANGE__RANGE_UNITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateSpecificationPackage.Literals.VALUE_RANGE__RANGE_UNITS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getValueRangeAccess().getLowerBigDecimalTypeParserRuleCall_1_0(), semanticObject.getLower());
		feeder.accept(grammarAccess.getValueRangeAccess().getUpperBigDecimalTypeParserRuleCall_3_0(), semanticObject.getUpper());
		feeder.accept(grammarAccess.getValueRangeAccess().getRangeTypeSTRINGTerminalRuleCall_6_0(), semanticObject.getRangeType());
		feeder.accept(grammarAccess.getValueRangeAccess().getRangeUnitsSTRINGTerminalRuleCall_8_0(), semanticObject.getRangeUnits());
		feeder.finish();
	}
	
	
}
