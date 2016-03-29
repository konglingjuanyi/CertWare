/*
 * generated by Xtext
 */
package net.certware.intent.serializer;

import com.google.inject.Inject;
import java.util.Set;
import net.certware.intent.intentSpecification.Decomposition;
import net.certware.intent.intentSpecification.DecompositionType;
import net.certware.intent.intentSpecification.DocItem;
import net.certware.intent.intentSpecification.DocItemType;
import net.certware.intent.intentSpecification.Document;
import net.certware.intent.intentSpecification.Intent;
import net.certware.intent.intentSpecification.IntentSpecificationPackage;
import net.certware.intent.intentSpecification.IntentType;
import net.certware.intent.intentSpecification.ListItem;
import net.certware.intent.intentSpecification.ListItemType;
import net.certware.intent.intentSpecification.ModelItem;
import net.certware.intent.intentSpecification.ModelType;
import net.certware.intent.intentSpecification.Refinement;
import net.certware.intent.intentSpecification.Specification;
import net.certware.intent.services.IntentSpecificationGrammarAccess;
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
public class IntentSpecificationSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private IntentSpecificationGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == IntentSpecificationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case IntentSpecificationPackage.DECOMPOSITION:
				sequence_Decomposition(context, (Decomposition) semanticObject); 
				return; 
			case IntentSpecificationPackage.DECOMPOSITION_TYPE:
				sequence_DecompositionType(context, (DecompositionType) semanticObject); 
				return; 
			case IntentSpecificationPackage.DOC_ITEM:
				sequence_DocItem(context, (DocItem) semanticObject); 
				return; 
			case IntentSpecificationPackage.DOC_ITEM_TYPE:
				sequence_DocItemType(context, (DocItemType) semanticObject); 
				return; 
			case IntentSpecificationPackage.DOCUMENT:
				sequence_Document(context, (Document) semanticObject); 
				return; 
			case IntentSpecificationPackage.INTENT:
				sequence_Intent(context, (Intent) semanticObject); 
				return; 
			case IntentSpecificationPackage.INTENT_TYPE:
				sequence_IntentType(context, (IntentType) semanticObject); 
				return; 
			case IntentSpecificationPackage.LIST_ITEM:
				sequence_ListItem(context, (ListItem) semanticObject); 
				return; 
			case IntentSpecificationPackage.LIST_ITEM_TYPE:
				sequence_ListItemType(context, (ListItemType) semanticObject); 
				return; 
			case IntentSpecificationPackage.MODEL_ITEM:
				sequence_ModelItem(context, (ModelItem) semanticObject); 
				return; 
			case IntentSpecificationPackage.MODEL_TYPE:
				sequence_ModelType(context, (ModelType) semanticObject); 
				return; 
			case IntentSpecificationPackage.REFINEMENT:
				sequence_Refinement(context, (Refinement) semanticObject); 
				return; 
			case IntentSpecificationPackage.SPECIFICATION:
				sequence_Specification(context, (Specification) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DecompositionType returns DecompositionType
	 *
	 * Constraint:
	 *     (typeName='environment' | typeName='operator' | typeName='system' | typeName='verification')
	 */
	protected void sequence_DecompositionType(ISerializationContext context, DecompositionType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Decomposition returns Decomposition
	 *
	 * Constraint:
	 *     (
	 *         type=DecompositionType 
	 *         name=ID 
	 *         desc=STRING 
	 *         documents+=Document* 
	 *         models+=ModelItem* 
	 *         items+=ListItem*
	 *     )
	 */
	protected void sequence_Decomposition(ISerializationContext context, Decomposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DocItemType returns DocItemType
	 *
	 * Constraint:
	 *     (
	 *         typeName='condition' | 
	 *         typeName='figure' | 
	 *         typeName='break' | 
	 *         typeName='model' | 
	 *         typeName='paragraph' | 
	 *         typeName='section' | 
	 *         typeName='table'
	 *     )
	 */
	protected void sequence_DocItemType(ISerializationContext context, DocItemType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DocItem returns DocItem
	 *
	 * Constraint:
	 *     (type=DocItemType name=ID ref=STRING)
	 */
	protected void sequence_DocItem(ISerializationContext context, DocItem semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IntentSpecificationPackage.Literals.DOC_ITEM__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IntentSpecificationPackage.Literals.DOC_ITEM__TYPE));
			if (transientValues.isValueTransient(semanticObject, IntentSpecificationPackage.Literals.DOC_ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IntentSpecificationPackage.Literals.DOC_ITEM__NAME));
			if (transientValues.isValueTransient(semanticObject, IntentSpecificationPackage.Literals.DOC_ITEM__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IntentSpecificationPackage.Literals.DOC_ITEM__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDocItemAccess().getTypeDocItemTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getDocItemAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDocItemAccess().getRefSTRINGTerminalRuleCall_2_0(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Document returns Document
	 *
	 * Constraint:
	 *     entries+=DocItem+
	 */
	protected void sequence_Document(ISerializationContext context, Document semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IntentType returns IntentType
	 *
	 * Constraint:
	 *     (
	 *         typeName='basic' | 
	 *         typeName='purpose' | 
	 *         typeName='principles' | 
	 *         typeName='models' | 
	 *         typeName='design' | 
	 *         typeName='implementation' | 
	 *         typeName='operation'
	 *     )
	 */
	protected void sequence_IntentType(ISerializationContext context, IntentType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Intent returns Intent
	 *
	 * Constraint:
	 *     (type=IntentType name=ID desc=STRING decompositions+=Decomposition+)
	 */
	protected void sequence_Intent(ISerializationContext context, Intent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ListItemType returns ListItemType
	 *
	 * Constraint:
	 *     (typeName='requirement' | typeName='goal' | typeName='hazard' | typeName='constraint')
	 */
	protected void sequence_ListItemType(ISerializationContext context, ListItemType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ListItem returns ListItem
	 *
	 * Constraint:
	 *     (
	 *         type=ListItemType 
	 *         name=ID 
	 *         desc=STRING 
	 *         docReferences+=[DocItem|ID]* 
	 *         itemReferences+=[ListItem|ID]* 
	 *         modelReferences+=[ModelItem|ID]*
	 *     )
	 */
	protected void sequence_ListItem(ISerializationContext context, ListItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelItem returns ModelItem
	 *
	 * Constraint:
	 *     (type=ModelType name=ID desc=STRING)
	 */
	protected void sequence_ModelItem(ISerializationContext context, ModelItem semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IntentSpecificationPackage.Literals.MODEL_ITEM__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IntentSpecificationPackage.Literals.MODEL_ITEM__TYPE));
			if (transientValues.isValueTransient(semanticObject, IntentSpecificationPackage.Literals.MODEL_ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IntentSpecificationPackage.Literals.MODEL_ITEM__NAME));
			if (transientValues.isValueTransient(semanticObject, IntentSpecificationPackage.Literals.MODEL_ITEM__DESC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IntentSpecificationPackage.Literals.MODEL_ITEM__DESC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelItemAccess().getTypeModelTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getModelItemAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getModelItemAccess().getDescSTRINGTerminalRuleCall_2_0(), semanticObject.getDesc());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ModelType returns ModelType
	 *
	 * Constraint:
	 *     (
	 *         typeName='output' | 
	 *         typeName='mode' | 
	 *         typeName='state' | 
	 *         typeName='macro' | 
	 *         typeName='function' | 
	 *         typeName='input'
	 *     )
	 */
	protected void sequence_ModelType(ISerializationContext context, ModelType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Refinement returns Refinement
	 *
	 * Constraint:
	 *     (name=ID desc=STRING intents+=Intent+)
	 */
	protected void sequence_Refinement(ISerializationContext context, Refinement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Specification returns Specification
	 *
	 * Constraint:
	 *     (name=ID refinements+=Refinement+)
	 */
	protected void sequence_Specification(ISerializationContext context, Specification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}