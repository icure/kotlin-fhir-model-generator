package io.icure.fhir.mapping.domain.fhir.r5

import io.icure.fhir.mapping.domain.fhir.CustomJsonPolymorphicSerializer
import io.icure.fhir.mapping.domain.fhir.r5.account.Account
import io.icure.fhir.mapping.domain.fhir.r5.activitydefinition.ActivityDefinition
import io.icure.fhir.mapping.domain.fhir.r5.actordefinition.ActorDefinition
import io.icure.fhir.mapping.domain.fhir.r5.administrableproductdefinition.AdministrableProductDefinition
import io.icure.fhir.mapping.domain.fhir.r5.adverseevent.AdverseEvent
import io.icure.fhir.mapping.domain.fhir.r5.age.Age
import io.icure.fhir.mapping.domain.fhir.r5.allergyintolerance.AllergyIntolerance
import io.icure.fhir.mapping.domain.fhir.r5.appointment.Appointment
import io.icure.fhir.mapping.domain.fhir.r5.appointmentresponse.AppointmentResponse
import io.icure.fhir.mapping.domain.fhir.r5.artifactassessment.ArtifactAssessment
import io.icure.fhir.mapping.domain.fhir.r5.auditevent.AuditEvent
import io.icure.fhir.mapping.domain.fhir.r5.basic.Basic
import io.icure.fhir.mapping.domain.fhir.r5.binary.Binary
import io.icure.fhir.mapping.domain.fhir.r5.biologicallyderivedproduct.BiologicallyDerivedProduct
import io.icure.fhir.mapping.domain.fhir.r5.biologicallyderivedproductdispense.BiologicallyDerivedProductDispense
import io.icure.fhir.mapping.domain.fhir.r5.bodystructure.BodyStructure
import io.icure.fhir.mapping.domain.fhir.r5.bundle.Bundle
import io.icure.fhir.mapping.domain.fhir.r5.canonicalresource.CanonicalResource
import io.icure.fhir.mapping.domain.fhir.r5.capabilitystatement.CapabilityStatement
import io.icure.fhir.mapping.domain.fhir.r5.careplan.CarePlan
import io.icure.fhir.mapping.domain.fhir.r5.careteam.CareTeam
import io.icure.fhir.mapping.domain.fhir.r5.chargeitem.ChargeItem
import io.icure.fhir.mapping.domain.fhir.r5.chargeitemdefinition.ChargeItemDefinition
import io.icure.fhir.mapping.domain.fhir.r5.citation.Citation
import io.icure.fhir.mapping.domain.fhir.r5.claim.Claim
import io.icure.fhir.mapping.domain.fhir.r5.claimresponse.ClaimResponse
import io.icure.fhir.mapping.domain.fhir.r5.clinicalimpression.ClinicalImpression
import io.icure.fhir.mapping.domain.fhir.r5.clinicalusedefinition.ClinicalUseDefinition
import io.icure.fhir.mapping.domain.fhir.r5.codesystem.CodeSystem
import io.icure.fhir.mapping.domain.fhir.r5.communication.Communication
import io.icure.fhir.mapping.domain.fhir.r5.communicationrequest.CommunicationRequest
import io.icure.fhir.mapping.domain.fhir.r5.compartmentdefinition.CompartmentDefinition
import io.icure.fhir.mapping.domain.fhir.r5.composition.Composition
import io.icure.fhir.mapping.domain.fhir.r5.conceptmap.ConceptMap
import io.icure.fhir.mapping.domain.fhir.r5.condition.Condition
import io.icure.fhir.mapping.domain.fhir.r5.conditiondefinition.ConditionDefinition
import io.icure.fhir.mapping.domain.fhir.r5.consent.Consent
import io.icure.fhir.mapping.domain.fhir.r5.contract.Contract
import io.icure.fhir.mapping.domain.fhir.r5.count.Count
import io.icure.fhir.mapping.domain.fhir.r5.coverage.Coverage
import io.icure.fhir.mapping.domain.fhir.r5.coverageeligibilityrequest.CoverageEligibilityRequest
import io.icure.fhir.mapping.domain.fhir.r5.coverageeligibilityresponse.CoverageEligibilityResponse
import io.icure.fhir.mapping.domain.fhir.r5.detectedissue.DetectedIssue
import io.icure.fhir.mapping.domain.fhir.r5.device.Device
import io.icure.fhir.mapping.domain.fhir.r5.deviceassociation.DeviceAssociation
import io.icure.fhir.mapping.domain.fhir.r5.devicedefinition.DeviceDefinition
import io.icure.fhir.mapping.domain.fhir.r5.devicedispense.DeviceDispense
import io.icure.fhir.mapping.domain.fhir.r5.devicemetric.DeviceMetric
import io.icure.fhir.mapping.domain.fhir.r5.devicerequest.DeviceRequest
import io.icure.fhir.mapping.domain.fhir.r5.deviceusage.DeviceUsage
import io.icure.fhir.mapping.domain.fhir.r5.diagnosticreport.DiagnosticReport
import io.icure.fhir.mapping.domain.fhir.r5.distance.Distance
import io.icure.fhir.mapping.domain.fhir.r5.documentreference.DocumentReference
import io.icure.fhir.mapping.domain.fhir.r5.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r5.encounter.Encounter
import io.icure.fhir.mapping.domain.fhir.r5.encounterhistory.EncounterHistory
import io.icure.fhir.mapping.domain.fhir.r5.endpoint.Endpoint
import io.icure.fhir.mapping.domain.fhir.r5.enrollmentrequest.EnrollmentRequest
import io.icure.fhir.mapping.domain.fhir.r5.enrollmentresponse.EnrollmentResponse
import io.icure.fhir.mapping.domain.fhir.r5.episodeofcare.EpisodeOfCare
import io.icure.fhir.mapping.domain.fhir.r5.eventdefinition.EventDefinition
import io.icure.fhir.mapping.domain.fhir.r5.evidence.Evidence
import io.icure.fhir.mapping.domain.fhir.r5.evidencereport.EvidenceReport
import io.icure.fhir.mapping.domain.fhir.r5.evidencevariable.EvidenceVariable
import io.icure.fhir.mapping.domain.fhir.r5.examplescenario.ExampleScenario
import io.icure.fhir.mapping.domain.fhir.r5.explanationofbenefit.ExplanationOfBenefit
import io.icure.fhir.mapping.domain.fhir.r5.familymemberhistory.FamilyMemberHistory
import io.icure.fhir.mapping.domain.fhir.r5.flag.Flag
import io.icure.fhir.mapping.domain.fhir.r5.formularyitem.FormularyItem
import io.icure.fhir.mapping.domain.fhir.r5.genomicstudy.GenomicStudy
import io.icure.fhir.mapping.domain.fhir.r5.goal.Goal
import io.icure.fhir.mapping.domain.fhir.r5.graphdefinition.GraphDefinition
import io.icure.fhir.mapping.domain.fhir.r5.group.Group
import io.icure.fhir.mapping.domain.fhir.r5.guidanceresponse.GuidanceResponse
import io.icure.fhir.mapping.domain.fhir.r5.healthcareservice.HealthcareService
import io.icure.fhir.mapping.domain.fhir.r5.imagingselection.ImagingSelection
import io.icure.fhir.mapping.domain.fhir.r5.imagingstudy.ImagingStudy
import io.icure.fhir.mapping.domain.fhir.r5.immunization.Immunization
import io.icure.fhir.mapping.domain.fhir.r5.immunizationevaluation.ImmunizationEvaluation
import io.icure.fhir.mapping.domain.fhir.r5.immunizationrecommendation.ImmunizationRecommendation
import io.icure.fhir.mapping.domain.fhir.r5.implementationguide.ImplementationGuide
import io.icure.fhir.mapping.domain.fhir.r5.ingredient.Ingredient
import io.icure.fhir.mapping.domain.fhir.r5.insuranceplan.InsurancePlan
import io.icure.fhir.mapping.domain.fhir.r5.inventoryitem.InventoryItem
import io.icure.fhir.mapping.domain.fhir.r5.inventoryreport.InventoryReport
import io.icure.fhir.mapping.domain.fhir.r5.invoice.Invoice
import io.icure.fhir.mapping.domain.fhir.r5.library.Library
import io.icure.fhir.mapping.domain.fhir.r5.linkage.Linkage
import io.icure.fhir.mapping.domain.fhir.r5.location.Location
import io.icure.fhir.mapping.domain.fhir.r5.manufactureditemdefinition.ManufacturedItemDefinition
import io.icure.fhir.mapping.domain.fhir.r5.measure.Measure
import io.icure.fhir.mapping.domain.fhir.r5.measurereport.MeasureReport
import io.icure.fhir.mapping.domain.fhir.r5.medication.Medication
import io.icure.fhir.mapping.domain.fhir.r5.medicationadministration.MedicationAdministration
import io.icure.fhir.mapping.domain.fhir.r5.medicationdispense.MedicationDispense
import io.icure.fhir.mapping.domain.fhir.r5.medicationknowledge.MedicationKnowledge
import io.icure.fhir.mapping.domain.fhir.r5.medicationrequest.MedicationRequest
import io.icure.fhir.mapping.domain.fhir.r5.medicationstatement.MedicationStatement
import io.icure.fhir.mapping.domain.fhir.r5.medicinalproductdefinition.MedicinalProductDefinition
import io.icure.fhir.mapping.domain.fhir.r5.messagedefinition.MessageDefinition
import io.icure.fhir.mapping.domain.fhir.r5.messageheader.MessageHeader
import io.icure.fhir.mapping.domain.fhir.r5.metadataresource.MetadataResource
import io.icure.fhir.mapping.domain.fhir.r5.molecularsequence.MolecularSequence
import io.icure.fhir.mapping.domain.fhir.r5.namingsystem.NamingSystem
import io.icure.fhir.mapping.domain.fhir.r5.nutritionintake.NutritionIntake
import io.icure.fhir.mapping.domain.fhir.r5.nutritionorder.NutritionOrder
import io.icure.fhir.mapping.domain.fhir.r5.nutritionproduct.NutritionProduct
import io.icure.fhir.mapping.domain.fhir.r5.observation.Observation
import io.icure.fhir.mapping.domain.fhir.r5.observationdefinition.ObservationDefinition
import io.icure.fhir.mapping.domain.fhir.r5.operationdefinition.OperationDefinition
import io.icure.fhir.mapping.domain.fhir.r5.operationoutcome.OperationOutcome
import io.icure.fhir.mapping.domain.fhir.r5.organization.Organization
import io.icure.fhir.mapping.domain.fhir.r5.organizationaffiliation.OrganizationAffiliation
import io.icure.fhir.mapping.domain.fhir.r5.packagedproductdefinition.PackagedProductDefinition
import io.icure.fhir.mapping.domain.fhir.r5.parameters.Parameters
import io.icure.fhir.mapping.domain.fhir.r5.patient.Patient
import io.icure.fhir.mapping.domain.fhir.r5.paymentnotice.PaymentNotice
import io.icure.fhir.mapping.domain.fhir.r5.paymentreconciliation.PaymentReconciliation
import io.icure.fhir.mapping.domain.fhir.r5.permission.Permission
import io.icure.fhir.mapping.domain.fhir.r5.person.Person
import io.icure.fhir.mapping.domain.fhir.r5.plandefinition.PlanDefinition
import io.icure.fhir.mapping.domain.fhir.r5.practitioner.Practitioner
import io.icure.fhir.mapping.domain.fhir.r5.practitionerrole.PractitionerRole
import io.icure.fhir.mapping.domain.fhir.r5.procedure.Procedure
import io.icure.fhir.mapping.domain.fhir.r5.provenance.Provenance
import io.icure.fhir.mapping.domain.fhir.r5.questionnaire.Questionnaire
import io.icure.fhir.mapping.domain.fhir.r5.questionnaireresponse.QuestionnaireResponse
import io.icure.fhir.mapping.domain.fhir.r5.regulatedauthorization.RegulatedAuthorization
import io.icure.fhir.mapping.domain.fhir.r5.relatedperson.RelatedPerson
import io.icure.fhir.mapping.domain.fhir.r5.requestorchestration.RequestOrchestration
import io.icure.fhir.mapping.domain.fhir.r5.requirements.Requirements
import io.icure.fhir.mapping.domain.fhir.r5.researchstudy.ResearchStudy
import io.icure.fhir.mapping.domain.fhir.r5.researchsubject.ResearchSubject
import io.icure.fhir.mapping.domain.fhir.r5.riskassessment.RiskAssessment
import io.icure.fhir.mapping.domain.fhir.r5.schedule.Schedule
import io.icure.fhir.mapping.domain.fhir.r5.searchparameter.SearchParameter
import io.icure.fhir.mapping.domain.fhir.r5.servicerequest.ServiceRequest
import io.icure.fhir.mapping.domain.fhir.r5.slot.Slot
import io.icure.fhir.mapping.domain.fhir.r5.specimen.Specimen
import io.icure.fhir.mapping.domain.fhir.r5.specimendefinition.SpecimenDefinition
import io.icure.fhir.mapping.domain.fhir.r5.structuredefinition.StructureDefinition
import io.icure.fhir.mapping.domain.fhir.r5.structuremap.StructureMap
import io.icure.fhir.mapping.domain.fhir.r5.subscription.Subscription
import io.icure.fhir.mapping.domain.fhir.r5.subscriptionstatus.SubscriptionStatus
import io.icure.fhir.mapping.domain.fhir.r5.subscriptiontopic.SubscriptionTopic
import io.icure.fhir.mapping.domain.fhir.r5.substance.Substance
import io.icure.fhir.mapping.domain.fhir.r5.substancedefinition.SubstanceDefinition
import io.icure.fhir.mapping.domain.fhir.r5.substancenucleicacid.SubstanceNucleicAcid
import io.icure.fhir.mapping.domain.fhir.r5.substancepolymer.SubstancePolymer
import io.icure.fhir.mapping.domain.fhir.r5.substanceprotein.SubstanceProtein
import io.icure.fhir.mapping.domain.fhir.r5.substancereferenceinformation.SubstanceReferenceInformation
import io.icure.fhir.mapping.domain.fhir.r5.substancesourcematerial.SubstanceSourceMaterial
import io.icure.fhir.mapping.domain.fhir.r5.supplydelivery.SupplyDelivery
import io.icure.fhir.mapping.domain.fhir.r5.supplyrequest.SupplyRequest
import io.icure.fhir.mapping.domain.fhir.r5.task.Task
import io.icure.fhir.mapping.domain.fhir.r5.terminologycapabilities.TerminologyCapabilities
import io.icure.fhir.mapping.domain.fhir.r5.testplan.TestPlan
import io.icure.fhir.mapping.domain.fhir.r5.testreport.TestReport
import io.icure.fhir.mapping.domain.fhir.r5.testscript.TestScript
import io.icure.fhir.mapping.domain.fhir.r5.transport.Transport
import io.icure.fhir.mapping.domain.fhir.r5.valueset.ValueSet
import io.icure.fhir.mapping.domain.fhir.r5.verificationresult.VerificationResult
import io.icure.fhir.mapping.domain.fhir.r5.visionprescription.VisionPrescription
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KClass
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object QuantitySerializer : KSerializer<Quantity> {
  override val descriptor: SerialDescriptor =
      io.icure.fhir.mapping.domain.fhir.r5.quantity.Quantity.serializer().descriptor


  override fun deserialize(decoder: Decoder): Quantity =
      decoder.decodeSerializableValue(io.icure.fhir.mapping.domain.fhir.r5.quantity.Quantity.serializer())

  override fun serialize(encoder: Encoder, `value`: Quantity): Unit = when (value) {
    is Age -> Age.serializer().serialize(encoder, value)
    is Count -> Count.serializer().serialize(encoder, value)
    is Distance -> Distance.serializer().serialize(encoder, value)
    is Duration -> Duration.serializer().serialize(encoder, value)
    is io.icure.fhir.mapping.domain.fhir.r5.quantity.Quantity ->
        io.icure.fhir.mapping.domain.fhir.r5.quantity.Quantity.serializer().serialize(encoder,
        value)
    else -> error("Unknown Quantity type: $value")
  }
}

public object ResourceSerializer : CustomJsonPolymorphicSerializer<Resource>("resourceType",
    "Resource") {
  override fun getSerializerBySerialName(serialName: String): KSerializer<out Resource> = when
      (serialName) {
    "Account" -> Account.serializer()
    "ActivityDefinition" -> ActivityDefinition.serializer()
    "ActorDefinition" -> ActorDefinition.serializer()
    "AdministrableProductDefinition" -> AdministrableProductDefinition.serializer()
    "AdverseEvent" -> AdverseEvent.serializer()
    "AllergyIntolerance" -> AllergyIntolerance.serializer()
    "Appointment" -> Appointment.serializer()
    "AppointmentResponse" -> AppointmentResponse.serializer()
    "ArtifactAssessment" -> ArtifactAssessment.serializer()
    "AuditEvent" -> AuditEvent.serializer()
    "Basic" -> Basic.serializer()
    "Binary" -> Binary.serializer()
    "BiologicallyDerivedProduct" -> BiologicallyDerivedProduct.serializer()
    "BiologicallyDerivedProductDispense" -> BiologicallyDerivedProductDispense.serializer()
    "BodyStructure" -> BodyStructure.serializer()
    "Bundle" -> Bundle.serializer()
    "CanonicalResource" -> CanonicalResource.serializer()
    "CapabilityStatement" -> CapabilityStatement.serializer()
    "CarePlan" -> CarePlan.serializer()
    "CareTeam" -> CareTeam.serializer()
    "ChargeItem" -> ChargeItem.serializer()
    "ChargeItemDefinition" -> ChargeItemDefinition.serializer()
    "Citation" -> Citation.serializer()
    "Claim" -> Claim.serializer()
    "ClaimResponse" -> ClaimResponse.serializer()
    "ClinicalImpression" -> ClinicalImpression.serializer()
    "ClinicalUseDefinition" -> ClinicalUseDefinition.serializer()
    "CodeSystem" -> CodeSystem.serializer()
    "Communication" -> Communication.serializer()
    "CommunicationRequest" -> CommunicationRequest.serializer()
    "CompartmentDefinition" -> CompartmentDefinition.serializer()
    "Composition" -> Composition.serializer()
    "ConceptMap" -> ConceptMap.serializer()
    "Condition" -> Condition.serializer()
    "ConditionDefinition" -> ConditionDefinition.serializer()
    "Consent" -> Consent.serializer()
    "Contract" -> Contract.serializer()
    "Coverage" -> Coverage.serializer()
    "CoverageEligibilityRequest" -> CoverageEligibilityRequest.serializer()
    "CoverageEligibilityResponse" -> CoverageEligibilityResponse.serializer()
    "DetectedIssue" -> DetectedIssue.serializer()
    "Device" -> Device.serializer()
    "DeviceAssociation" -> DeviceAssociation.serializer()
    "DeviceDefinition" -> DeviceDefinition.serializer()
    "DeviceDispense" -> DeviceDispense.serializer()
    "DeviceMetric" -> DeviceMetric.serializer()
    "DeviceRequest" -> DeviceRequest.serializer()
    "DeviceUsage" -> DeviceUsage.serializer()
    "DiagnosticReport" -> DiagnosticReport.serializer()
    "DocumentReference" -> DocumentReference.serializer()
    "Encounter" -> Encounter.serializer()
    "EncounterHistory" -> EncounterHistory.serializer()
    "Endpoint" -> Endpoint.serializer()
    "EnrollmentRequest" -> EnrollmentRequest.serializer()
    "EnrollmentResponse" -> EnrollmentResponse.serializer()
    "EpisodeOfCare" -> EpisodeOfCare.serializer()
    "EventDefinition" -> EventDefinition.serializer()
    "Evidence" -> Evidence.serializer()
    "EvidenceReport" -> EvidenceReport.serializer()
    "EvidenceVariable" -> EvidenceVariable.serializer()
    "ExampleScenario" -> ExampleScenario.serializer()
    "ExplanationOfBenefit" -> ExplanationOfBenefit.serializer()
    "FamilyMemberHistory" -> FamilyMemberHistory.serializer()
    "Flag" -> Flag.serializer()
    "FormularyItem" -> FormularyItem.serializer()
    "GenomicStudy" -> GenomicStudy.serializer()
    "Goal" -> Goal.serializer()
    "GraphDefinition" -> GraphDefinition.serializer()
    "Group" -> Group.serializer()
    "GuidanceResponse" -> GuidanceResponse.serializer()
    "HealthcareService" -> HealthcareService.serializer()
    "ImagingSelection" -> ImagingSelection.serializer()
    "ImagingStudy" -> ImagingStudy.serializer()
    "Immunization" -> Immunization.serializer()
    "ImmunizationEvaluation" -> ImmunizationEvaluation.serializer()
    "ImmunizationRecommendation" -> ImmunizationRecommendation.serializer()
    "ImplementationGuide" -> ImplementationGuide.serializer()
    "Ingredient" -> Ingredient.serializer()
    "InsurancePlan" -> InsurancePlan.serializer()
    "InventoryItem" -> InventoryItem.serializer()
    "InventoryReport" -> InventoryReport.serializer()
    "Invoice" -> Invoice.serializer()
    "Library" -> Library.serializer()
    "Linkage" -> Linkage.serializer()
    "Location" -> Location.serializer()
    "ManufacturedItemDefinition" -> ManufacturedItemDefinition.serializer()
    "Measure" -> Measure.serializer()
    "MeasureReport" -> MeasureReport.serializer()
    "Medication" -> Medication.serializer()
    "MedicationAdministration" -> MedicationAdministration.serializer()
    "MedicationDispense" -> MedicationDispense.serializer()
    "MedicationKnowledge" -> MedicationKnowledge.serializer()
    "MedicationRequest" -> MedicationRequest.serializer()
    "MedicationStatement" -> MedicationStatement.serializer()
    "MedicinalProductDefinition" -> MedicinalProductDefinition.serializer()
    "MessageDefinition" -> MessageDefinition.serializer()
    "MessageHeader" -> MessageHeader.serializer()
    "MetadataResource" -> MetadataResource.serializer()
    "MolecularSequence" -> MolecularSequence.serializer()
    "NamingSystem" -> NamingSystem.serializer()
    "NutritionIntake" -> NutritionIntake.serializer()
    "NutritionOrder" -> NutritionOrder.serializer()
    "NutritionProduct" -> NutritionProduct.serializer()
    "Observation" -> Observation.serializer()
    "ObservationDefinition" -> ObservationDefinition.serializer()
    "OperationDefinition" -> OperationDefinition.serializer()
    "OperationOutcome" -> OperationOutcome.serializer()
    "Organization" -> Organization.serializer()
    "OrganizationAffiliation" -> OrganizationAffiliation.serializer()
    "PackagedProductDefinition" -> PackagedProductDefinition.serializer()
    "Parameters" -> Parameters.serializer()
    "Patient" -> Patient.serializer()
    "PaymentNotice" -> PaymentNotice.serializer()
    "PaymentReconciliation" -> PaymentReconciliation.serializer()
    "Permission" -> Permission.serializer()
    "Person" -> Person.serializer()
    "PlanDefinition" -> PlanDefinition.serializer()
    "Practitioner" -> Practitioner.serializer()
    "PractitionerRole" -> PractitionerRole.serializer()
    "Procedure" -> Procedure.serializer()
    "Provenance" -> Provenance.serializer()
    "Questionnaire" -> Questionnaire.serializer()
    "QuestionnaireResponse" -> QuestionnaireResponse.serializer()
    "RegulatedAuthorization" -> RegulatedAuthorization.serializer()
    "RelatedPerson" -> RelatedPerson.serializer()
    "RequestOrchestration" -> RequestOrchestration.serializer()
    "Requirements" -> Requirements.serializer()
    "ResearchStudy" -> ResearchStudy.serializer()
    "ResearchSubject" -> ResearchSubject.serializer()
    "RiskAssessment" -> RiskAssessment.serializer()
    "Schedule" -> Schedule.serializer()
    "SearchParameter" -> SearchParameter.serializer()
    "ServiceRequest" -> ServiceRequest.serializer()
    "Slot" -> Slot.serializer()
    "Specimen" -> Specimen.serializer()
    "SpecimenDefinition" -> SpecimenDefinition.serializer()
    "StructureDefinition" -> StructureDefinition.serializer()
    "StructureMap" -> StructureMap.serializer()
    "Subscription" -> Subscription.serializer()
    "SubscriptionStatus" -> SubscriptionStatus.serializer()
    "SubscriptionTopic" -> SubscriptionTopic.serializer()
    "Substance" -> Substance.serializer()
    "SubstanceDefinition" -> SubstanceDefinition.serializer()
    "SubstanceNucleicAcid" -> SubstanceNucleicAcid.serializer()
    "SubstancePolymer" -> SubstancePolymer.serializer()
    "SubstanceProtein" -> SubstanceProtein.serializer()
    "SubstanceReferenceInformation" -> SubstanceReferenceInformation.serializer()
    "SubstanceSourceMaterial" -> SubstanceSourceMaterial.serializer()
    "SupplyDelivery" -> SupplyDelivery.serializer()
    "SupplyRequest" -> SupplyRequest.serializer()
    "Task" -> Task.serializer()
    "TerminologyCapabilities" -> TerminologyCapabilities.serializer()
    "TestPlan" -> TestPlan.serializer()
    "TestReport" -> TestReport.serializer()
    "TestScript" -> TestScript.serializer()
    "Transport" -> Transport.serializer()
    "ValueSet" -> ValueSet.serializer()
    "VerificationResult" -> VerificationResult.serializer()
    "VisionPrescription" -> VisionPrescription.serializer()
    else -> error("Unknown Resource type: $serialName")
  }

  override fun getSerializerByClass(kclass: KClass<out Resource>): KSerializer<out Resource> = when
      (kclass) {
    Account::class -> Account.serializer()
    ActivityDefinition::class -> ActivityDefinition.serializer()
    ActorDefinition::class -> ActorDefinition.serializer()
    AdministrableProductDefinition::class -> AdministrableProductDefinition.serializer()
    AdverseEvent::class -> AdverseEvent.serializer()
    AllergyIntolerance::class -> AllergyIntolerance.serializer()
    Appointment::class -> Appointment.serializer()
    AppointmentResponse::class -> AppointmentResponse.serializer()
    ArtifactAssessment::class -> ArtifactAssessment.serializer()
    AuditEvent::class -> AuditEvent.serializer()
    Basic::class -> Basic.serializer()
    Binary::class -> Binary.serializer()
    BiologicallyDerivedProduct::class -> BiologicallyDerivedProduct.serializer()
    BiologicallyDerivedProductDispense::class -> BiologicallyDerivedProductDispense.serializer()
    BodyStructure::class -> BodyStructure.serializer()
    Bundle::class -> Bundle.serializer()
    CanonicalResource::class -> CanonicalResource.serializer()
    CapabilityStatement::class -> CapabilityStatement.serializer()
    CarePlan::class -> CarePlan.serializer()
    CareTeam::class -> CareTeam.serializer()
    ChargeItem::class -> ChargeItem.serializer()
    ChargeItemDefinition::class -> ChargeItemDefinition.serializer()
    Citation::class -> Citation.serializer()
    Claim::class -> Claim.serializer()
    ClaimResponse::class -> ClaimResponse.serializer()
    ClinicalImpression::class -> ClinicalImpression.serializer()
    ClinicalUseDefinition::class -> ClinicalUseDefinition.serializer()
    CodeSystem::class -> CodeSystem.serializer()
    Communication::class -> Communication.serializer()
    CommunicationRequest::class -> CommunicationRequest.serializer()
    CompartmentDefinition::class -> CompartmentDefinition.serializer()
    Composition::class -> Composition.serializer()
    ConceptMap::class -> ConceptMap.serializer()
    Condition::class -> Condition.serializer()
    ConditionDefinition::class -> ConditionDefinition.serializer()
    Consent::class -> Consent.serializer()
    Contract::class -> Contract.serializer()
    Coverage::class -> Coverage.serializer()
    CoverageEligibilityRequest::class -> CoverageEligibilityRequest.serializer()
    CoverageEligibilityResponse::class -> CoverageEligibilityResponse.serializer()
    DetectedIssue::class -> DetectedIssue.serializer()
    Device::class -> Device.serializer()
    DeviceAssociation::class -> DeviceAssociation.serializer()
    DeviceDefinition::class -> DeviceDefinition.serializer()
    DeviceDispense::class -> DeviceDispense.serializer()
    DeviceMetric::class -> DeviceMetric.serializer()
    DeviceRequest::class -> DeviceRequest.serializer()
    DeviceUsage::class -> DeviceUsage.serializer()
    DiagnosticReport::class -> DiagnosticReport.serializer()
    DocumentReference::class -> DocumentReference.serializer()
    Encounter::class -> Encounter.serializer()
    EncounterHistory::class -> EncounterHistory.serializer()
    Endpoint::class -> Endpoint.serializer()
    EnrollmentRequest::class -> EnrollmentRequest.serializer()
    EnrollmentResponse::class -> EnrollmentResponse.serializer()
    EpisodeOfCare::class -> EpisodeOfCare.serializer()
    EventDefinition::class -> EventDefinition.serializer()
    Evidence::class -> Evidence.serializer()
    EvidenceReport::class -> EvidenceReport.serializer()
    EvidenceVariable::class -> EvidenceVariable.serializer()
    ExampleScenario::class -> ExampleScenario.serializer()
    ExplanationOfBenefit::class -> ExplanationOfBenefit.serializer()
    FamilyMemberHistory::class -> FamilyMemberHistory.serializer()
    Flag::class -> Flag.serializer()
    FormularyItem::class -> FormularyItem.serializer()
    GenomicStudy::class -> GenomicStudy.serializer()
    Goal::class -> Goal.serializer()
    GraphDefinition::class -> GraphDefinition.serializer()
    Group::class -> Group.serializer()
    GuidanceResponse::class -> GuidanceResponse.serializer()
    HealthcareService::class -> HealthcareService.serializer()
    ImagingSelection::class -> ImagingSelection.serializer()
    ImagingStudy::class -> ImagingStudy.serializer()
    Immunization::class -> Immunization.serializer()
    ImmunizationEvaluation::class -> ImmunizationEvaluation.serializer()
    ImmunizationRecommendation::class -> ImmunizationRecommendation.serializer()
    ImplementationGuide::class -> ImplementationGuide.serializer()
    Ingredient::class -> Ingredient.serializer()
    InsurancePlan::class -> InsurancePlan.serializer()
    InventoryItem::class -> InventoryItem.serializer()
    InventoryReport::class -> InventoryReport.serializer()
    Invoice::class -> Invoice.serializer()
    Library::class -> Library.serializer()
    Linkage::class -> Linkage.serializer()
    Location::class -> Location.serializer()
    ManufacturedItemDefinition::class -> ManufacturedItemDefinition.serializer()
    Measure::class -> Measure.serializer()
    MeasureReport::class -> MeasureReport.serializer()
    Medication::class -> Medication.serializer()
    MedicationAdministration::class -> MedicationAdministration.serializer()
    MedicationDispense::class -> MedicationDispense.serializer()
    MedicationKnowledge::class -> MedicationKnowledge.serializer()
    MedicationRequest::class -> MedicationRequest.serializer()
    MedicationStatement::class -> MedicationStatement.serializer()
    MedicinalProductDefinition::class -> MedicinalProductDefinition.serializer()
    MessageDefinition::class -> MessageDefinition.serializer()
    MessageHeader::class -> MessageHeader.serializer()
    MetadataResource::class -> MetadataResource.serializer()
    MolecularSequence::class -> MolecularSequence.serializer()
    NamingSystem::class -> NamingSystem.serializer()
    NutritionIntake::class -> NutritionIntake.serializer()
    NutritionOrder::class -> NutritionOrder.serializer()
    NutritionProduct::class -> NutritionProduct.serializer()
    Observation::class -> Observation.serializer()
    ObservationDefinition::class -> ObservationDefinition.serializer()
    OperationDefinition::class -> OperationDefinition.serializer()
    OperationOutcome::class -> OperationOutcome.serializer()
    Organization::class -> Organization.serializer()
    OrganizationAffiliation::class -> OrganizationAffiliation.serializer()
    PackagedProductDefinition::class -> PackagedProductDefinition.serializer()
    Parameters::class -> Parameters.serializer()
    Patient::class -> Patient.serializer()
    PaymentNotice::class -> PaymentNotice.serializer()
    PaymentReconciliation::class -> PaymentReconciliation.serializer()
    Permission::class -> Permission.serializer()
    Person::class -> Person.serializer()
    PlanDefinition::class -> PlanDefinition.serializer()
    Practitioner::class -> Practitioner.serializer()
    PractitionerRole::class -> PractitionerRole.serializer()
    Procedure::class -> Procedure.serializer()
    Provenance::class -> Provenance.serializer()
    Questionnaire::class -> Questionnaire.serializer()
    QuestionnaireResponse::class -> QuestionnaireResponse.serializer()
    RegulatedAuthorization::class -> RegulatedAuthorization.serializer()
    RelatedPerson::class -> RelatedPerson.serializer()
    RequestOrchestration::class -> RequestOrchestration.serializer()
    Requirements::class -> Requirements.serializer()
    ResearchStudy::class -> ResearchStudy.serializer()
    ResearchSubject::class -> ResearchSubject.serializer()
    RiskAssessment::class -> RiskAssessment.serializer()
    Schedule::class -> Schedule.serializer()
    SearchParameter::class -> SearchParameter.serializer()
    ServiceRequest::class -> ServiceRequest.serializer()
    Slot::class -> Slot.serializer()
    Specimen::class -> Specimen.serializer()
    SpecimenDefinition::class -> SpecimenDefinition.serializer()
    StructureDefinition::class -> StructureDefinition.serializer()
    StructureMap::class -> StructureMap.serializer()
    Subscription::class -> Subscription.serializer()
    SubscriptionStatus::class -> SubscriptionStatus.serializer()
    SubscriptionTopic::class -> SubscriptionTopic.serializer()
    Substance::class -> Substance.serializer()
    SubstanceDefinition::class -> SubstanceDefinition.serializer()
    SubstanceNucleicAcid::class -> SubstanceNucleicAcid.serializer()
    SubstancePolymer::class -> SubstancePolymer.serializer()
    SubstanceProtein::class -> SubstanceProtein.serializer()
    SubstanceReferenceInformation::class -> SubstanceReferenceInformation.serializer()
    SubstanceSourceMaterial::class -> SubstanceSourceMaterial.serializer()
    SupplyDelivery::class -> SupplyDelivery.serializer()
    SupplyRequest::class -> SupplyRequest.serializer()
    Task::class -> Task.serializer()
    TerminologyCapabilities::class -> TerminologyCapabilities.serializer()
    TestPlan::class -> TestPlan.serializer()
    TestReport::class -> TestReport.serializer()
    TestScript::class -> TestScript.serializer()
    Transport::class -> Transport.serializer()
    ValueSet::class -> ValueSet.serializer()
    VerificationResult::class -> VerificationResult.serializer()
    VisionPrescription::class -> VisionPrescription.serializer()
    else -> error("Unknown resource type: $kclass")
  }
}
