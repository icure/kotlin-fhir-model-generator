package io.icure.fhir.mapping.domain.fhir.r4b

import io.icure.fhir.mapping.domain.fhir.CustomJsonPolymorphicSerializer
import io.icure.fhir.mapping.domain.fhir.r4b.account.Account
import io.icure.fhir.mapping.domain.fhir.r4b.activitydefinition.ActivityDefinition
import io.icure.fhir.mapping.domain.fhir.r4b.administrableproductdefinition.AdministrableProductDefinition
import io.icure.fhir.mapping.domain.fhir.r4b.adverseevent.AdverseEvent
import io.icure.fhir.mapping.domain.fhir.r4b.age.Age
import io.icure.fhir.mapping.domain.fhir.r4b.allergyintolerance.AllergyIntolerance
import io.icure.fhir.mapping.domain.fhir.r4b.appointment.Appointment
import io.icure.fhir.mapping.domain.fhir.r4b.appointmentresponse.AppointmentResponse
import io.icure.fhir.mapping.domain.fhir.r4b.auditevent.AuditEvent
import io.icure.fhir.mapping.domain.fhir.r4b.basic.Basic
import io.icure.fhir.mapping.domain.fhir.r4b.binary.Binary
import io.icure.fhir.mapping.domain.fhir.r4b.biologicallyderivedproduct.BiologicallyDerivedProduct
import io.icure.fhir.mapping.domain.fhir.r4b.bodystructure.BodyStructure
import io.icure.fhir.mapping.domain.fhir.r4b.bundle.Bundle
import io.icure.fhir.mapping.domain.fhir.r4b.capabilitystatement.CapabilityStatement
import io.icure.fhir.mapping.domain.fhir.r4b.careplan.CarePlan
import io.icure.fhir.mapping.domain.fhir.r4b.careteam.CareTeam
import io.icure.fhir.mapping.domain.fhir.r4b.catalogentry.CatalogEntry
import io.icure.fhir.mapping.domain.fhir.r4b.chargeitem.ChargeItem
import io.icure.fhir.mapping.domain.fhir.r4b.chargeitemdefinition.ChargeItemDefinition
import io.icure.fhir.mapping.domain.fhir.r4b.citation.Citation
import io.icure.fhir.mapping.domain.fhir.r4b.claim.Claim
import io.icure.fhir.mapping.domain.fhir.r4b.claimresponse.ClaimResponse
import io.icure.fhir.mapping.domain.fhir.r4b.clinicalimpression.ClinicalImpression
import io.icure.fhir.mapping.domain.fhir.r4b.clinicalusedefinition.ClinicalUseDefinition
import io.icure.fhir.mapping.domain.fhir.r4b.codesystem.CodeSystem
import io.icure.fhir.mapping.domain.fhir.r4b.communication.Communication
import io.icure.fhir.mapping.domain.fhir.r4b.communicationrequest.CommunicationRequest
import io.icure.fhir.mapping.domain.fhir.r4b.compartmentdefinition.CompartmentDefinition
import io.icure.fhir.mapping.domain.fhir.r4b.composition.Composition
import io.icure.fhir.mapping.domain.fhir.r4b.conceptmap.ConceptMap
import io.icure.fhir.mapping.domain.fhir.r4b.condition.Condition
import io.icure.fhir.mapping.domain.fhir.r4b.consent.Consent
import io.icure.fhir.mapping.domain.fhir.r4b.contract.Contract
import io.icure.fhir.mapping.domain.fhir.r4b.count.Count
import io.icure.fhir.mapping.domain.fhir.r4b.coverage.Coverage
import io.icure.fhir.mapping.domain.fhir.r4b.coverageeligibilityrequest.CoverageEligibilityRequest
import io.icure.fhir.mapping.domain.fhir.r4b.coverageeligibilityresponse.CoverageEligibilityResponse
import io.icure.fhir.mapping.domain.fhir.r4b.detectedissue.DetectedIssue
import io.icure.fhir.mapping.domain.fhir.r4b.device.Device
import io.icure.fhir.mapping.domain.fhir.r4b.devicedefinition.DeviceDefinition
import io.icure.fhir.mapping.domain.fhir.r4b.devicemetric.DeviceMetric
import io.icure.fhir.mapping.domain.fhir.r4b.devicerequest.DeviceRequest
import io.icure.fhir.mapping.domain.fhir.r4b.deviceusestatement.DeviceUseStatement
import io.icure.fhir.mapping.domain.fhir.r4b.diagnosticreport.DiagnosticReport
import io.icure.fhir.mapping.domain.fhir.r4b.distance.Distance
import io.icure.fhir.mapping.domain.fhir.r4b.documentmanifest.DocumentManifest
import io.icure.fhir.mapping.domain.fhir.r4b.documentreference.DocumentReference
import io.icure.fhir.mapping.domain.fhir.r4b.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r4b.encounter.Encounter
import io.icure.fhir.mapping.domain.fhir.r4b.endpoint.Endpoint
import io.icure.fhir.mapping.domain.fhir.r4b.enrollmentrequest.EnrollmentRequest
import io.icure.fhir.mapping.domain.fhir.r4b.enrollmentresponse.EnrollmentResponse
import io.icure.fhir.mapping.domain.fhir.r4b.episodeofcare.EpisodeOfCare
import io.icure.fhir.mapping.domain.fhir.r4b.eventdefinition.EventDefinition
import io.icure.fhir.mapping.domain.fhir.r4b.evidence.Evidence
import io.icure.fhir.mapping.domain.fhir.r4b.evidencereport.EvidenceReport
import io.icure.fhir.mapping.domain.fhir.r4b.evidencevariable.EvidenceVariable
import io.icure.fhir.mapping.domain.fhir.r4b.examplescenario.ExampleScenario
import io.icure.fhir.mapping.domain.fhir.r4b.explanationofbenefit.ExplanationOfBenefit
import io.icure.fhir.mapping.domain.fhir.r4b.familymemberhistory.FamilyMemberHistory
import io.icure.fhir.mapping.domain.fhir.r4b.flag.Flag
import io.icure.fhir.mapping.domain.fhir.r4b.goal.Goal
import io.icure.fhir.mapping.domain.fhir.r4b.graphdefinition.GraphDefinition
import io.icure.fhir.mapping.domain.fhir.r4b.group.Group
import io.icure.fhir.mapping.domain.fhir.r4b.guidanceresponse.GuidanceResponse
import io.icure.fhir.mapping.domain.fhir.r4b.healthcareservice.HealthcareService
import io.icure.fhir.mapping.domain.fhir.r4b.imagingstudy.ImagingStudy
import io.icure.fhir.mapping.domain.fhir.r4b.immunization.Immunization
import io.icure.fhir.mapping.domain.fhir.r4b.immunizationevaluation.ImmunizationEvaluation
import io.icure.fhir.mapping.domain.fhir.r4b.immunizationrecommendation.ImmunizationRecommendation
import io.icure.fhir.mapping.domain.fhir.r4b.implementationguide.ImplementationGuide
import io.icure.fhir.mapping.domain.fhir.r4b.ingredient.Ingredient
import io.icure.fhir.mapping.domain.fhir.r4b.insuranceplan.InsurancePlan
import io.icure.fhir.mapping.domain.fhir.r4b.invoice.Invoice
import io.icure.fhir.mapping.domain.fhir.r4b.library.Library
import io.icure.fhir.mapping.domain.fhir.r4b.linkage.Linkage
import io.icure.fhir.mapping.domain.fhir.r4b.location.Location
import io.icure.fhir.mapping.domain.fhir.r4b.manufactureditemdefinition.ManufacturedItemDefinition
import io.icure.fhir.mapping.domain.fhir.r4b.measure.Measure
import io.icure.fhir.mapping.domain.fhir.r4b.measurereport.MeasureReport
import io.icure.fhir.mapping.domain.fhir.r4b.media.Media
import io.icure.fhir.mapping.domain.fhir.r4b.medication.Medication
import io.icure.fhir.mapping.domain.fhir.r4b.medicationadministration.MedicationAdministration
import io.icure.fhir.mapping.domain.fhir.r4b.medicationdispense.MedicationDispense
import io.icure.fhir.mapping.domain.fhir.r4b.medicationknowledge.MedicationKnowledge
import io.icure.fhir.mapping.domain.fhir.r4b.medicationrequest.MedicationRequest
import io.icure.fhir.mapping.domain.fhir.r4b.medicationstatement.MedicationStatement
import io.icure.fhir.mapping.domain.fhir.r4b.medicinalproductdefinition.MedicinalProductDefinition
import io.icure.fhir.mapping.domain.fhir.r4b.messagedefinition.MessageDefinition
import io.icure.fhir.mapping.domain.fhir.r4b.messageheader.MessageHeader
import io.icure.fhir.mapping.domain.fhir.r4b.molecularsequence.MolecularSequence
import io.icure.fhir.mapping.domain.fhir.r4b.namingsystem.NamingSystem
import io.icure.fhir.mapping.domain.fhir.r4b.nutritionorder.NutritionOrder
import io.icure.fhir.mapping.domain.fhir.r4b.nutritionproduct.NutritionProduct
import io.icure.fhir.mapping.domain.fhir.r4b.observation.Observation
import io.icure.fhir.mapping.domain.fhir.r4b.observationdefinition.ObservationDefinition
import io.icure.fhir.mapping.domain.fhir.r4b.operationdefinition.OperationDefinition
import io.icure.fhir.mapping.domain.fhir.r4b.operationoutcome.OperationOutcome
import io.icure.fhir.mapping.domain.fhir.r4b.organization.Organization
import io.icure.fhir.mapping.domain.fhir.r4b.organizationaffiliation.OrganizationAffiliation
import io.icure.fhir.mapping.domain.fhir.r4b.packagedproductdefinition.PackagedProductDefinition
import io.icure.fhir.mapping.domain.fhir.r4b.parameters.Parameters
import io.icure.fhir.mapping.domain.fhir.r4b.patient.Patient
import io.icure.fhir.mapping.domain.fhir.r4b.paymentnotice.PaymentNotice
import io.icure.fhir.mapping.domain.fhir.r4b.paymentreconciliation.PaymentReconciliation
import io.icure.fhir.mapping.domain.fhir.r4b.person.Person
import io.icure.fhir.mapping.domain.fhir.r4b.plandefinition.PlanDefinition
import io.icure.fhir.mapping.domain.fhir.r4b.practitioner.Practitioner
import io.icure.fhir.mapping.domain.fhir.r4b.practitionerrole.PractitionerRole
import io.icure.fhir.mapping.domain.fhir.r4b.procedure.Procedure
import io.icure.fhir.mapping.domain.fhir.r4b.provenance.Provenance
import io.icure.fhir.mapping.domain.fhir.r4b.questionnaire.Questionnaire
import io.icure.fhir.mapping.domain.fhir.r4b.questionnaireresponse.QuestionnaireResponse
import io.icure.fhir.mapping.domain.fhir.r4b.regulatedauthorization.RegulatedAuthorization
import io.icure.fhir.mapping.domain.fhir.r4b.relatedperson.RelatedPerson
import io.icure.fhir.mapping.domain.fhir.r4b.requestgroup.RequestGroup
import io.icure.fhir.mapping.domain.fhir.r4b.researchdefinition.ResearchDefinition
import io.icure.fhir.mapping.domain.fhir.r4b.researchelementdefinition.ResearchElementDefinition
import io.icure.fhir.mapping.domain.fhir.r4b.researchstudy.ResearchStudy
import io.icure.fhir.mapping.domain.fhir.r4b.researchsubject.ResearchSubject
import io.icure.fhir.mapping.domain.fhir.r4b.riskassessment.RiskAssessment
import io.icure.fhir.mapping.domain.fhir.r4b.schedule.Schedule
import io.icure.fhir.mapping.domain.fhir.r4b.searchparameter.SearchParameter
import io.icure.fhir.mapping.domain.fhir.r4b.servicerequest.ServiceRequest
import io.icure.fhir.mapping.domain.fhir.r4b.slot.Slot
import io.icure.fhir.mapping.domain.fhir.r4b.specimen.Specimen
import io.icure.fhir.mapping.domain.fhir.r4b.specimendefinition.SpecimenDefinition
import io.icure.fhir.mapping.domain.fhir.r4b.structuredefinition.StructureDefinition
import io.icure.fhir.mapping.domain.fhir.r4b.structuremap.StructureMap
import io.icure.fhir.mapping.domain.fhir.r4b.subscription.Subscription
import io.icure.fhir.mapping.domain.fhir.r4b.subscriptionstatus.SubscriptionStatus
import io.icure.fhir.mapping.domain.fhir.r4b.subscriptiontopic.SubscriptionTopic
import io.icure.fhir.mapping.domain.fhir.r4b.substance.Substance
import io.icure.fhir.mapping.domain.fhir.r4b.substancedefinition.SubstanceDefinition
import io.icure.fhir.mapping.domain.fhir.r4b.supplydelivery.SupplyDelivery
import io.icure.fhir.mapping.domain.fhir.r4b.supplyrequest.SupplyRequest
import io.icure.fhir.mapping.domain.fhir.r4b.task.Task
import io.icure.fhir.mapping.domain.fhir.r4b.terminologycapabilities.TerminologyCapabilities
import io.icure.fhir.mapping.domain.fhir.r4b.testreport.TestReport
import io.icure.fhir.mapping.domain.fhir.r4b.testscript.TestScript
import io.icure.fhir.mapping.domain.fhir.r4b.valueset.ValueSet
import io.icure.fhir.mapping.domain.fhir.r4b.verificationresult.VerificationResult
import io.icure.fhir.mapping.domain.fhir.r4b.visionprescription.VisionPrescription
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KClass
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object QuantitySerializer : KSerializer<Quantity> {
  override val descriptor: SerialDescriptor =
      io.icure.fhir.mapping.domain.fhir.r4b.quantity.Quantity.serializer().descriptor


  override fun deserialize(decoder: Decoder): Quantity =
      decoder.decodeSerializableValue(io.icure.fhir.mapping.domain.fhir.r4b.quantity.Quantity.serializer())

  override fun serialize(encoder: Encoder, `value`: Quantity): Unit = when (value) {
    is Age -> Age.serializer().serialize(encoder, value)
    is Count -> Count.serializer().serialize(encoder, value)
    is Distance -> Distance.serializer().serialize(encoder, value)
    is Duration -> Duration.serializer().serialize(encoder, value)
    is io.icure.fhir.mapping.domain.fhir.r4b.quantity.Quantity ->
        io.icure.fhir.mapping.domain.fhir.r4b.quantity.Quantity.serializer().serialize(encoder,
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
    "AdministrableProductDefinition" -> AdministrableProductDefinition.serializer()
    "AdverseEvent" -> AdverseEvent.serializer()
    "AllergyIntolerance" -> AllergyIntolerance.serializer()
    "Appointment" -> Appointment.serializer()
    "AppointmentResponse" -> AppointmentResponse.serializer()
    "AuditEvent" -> AuditEvent.serializer()
    "Basic" -> Basic.serializer()
    "Binary" -> Binary.serializer()
    "BiologicallyDerivedProduct" -> BiologicallyDerivedProduct.serializer()
    "BodyStructure" -> BodyStructure.serializer()
    "Bundle" -> Bundle.serializer()
    "CapabilityStatement" -> CapabilityStatement.serializer()
    "CarePlan" -> CarePlan.serializer()
    "CareTeam" -> CareTeam.serializer()
    "CatalogEntry" -> CatalogEntry.serializer()
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
    "Consent" -> Consent.serializer()
    "Contract" -> Contract.serializer()
    "Coverage" -> Coverage.serializer()
    "CoverageEligibilityRequest" -> CoverageEligibilityRequest.serializer()
    "CoverageEligibilityResponse" -> CoverageEligibilityResponse.serializer()
    "DetectedIssue" -> DetectedIssue.serializer()
    "Device" -> Device.serializer()
    "DeviceDefinition" -> DeviceDefinition.serializer()
    "DeviceMetric" -> DeviceMetric.serializer()
    "DeviceRequest" -> DeviceRequest.serializer()
    "DeviceUseStatement" -> DeviceUseStatement.serializer()
    "DiagnosticReport" -> DiagnosticReport.serializer()
    "DocumentManifest" -> DocumentManifest.serializer()
    "DocumentReference" -> DocumentReference.serializer()
    "Encounter" -> Encounter.serializer()
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
    "Goal" -> Goal.serializer()
    "GraphDefinition" -> GraphDefinition.serializer()
    "Group" -> Group.serializer()
    "GuidanceResponse" -> GuidanceResponse.serializer()
    "HealthcareService" -> HealthcareService.serializer()
    "ImagingStudy" -> ImagingStudy.serializer()
    "Immunization" -> Immunization.serializer()
    "ImmunizationEvaluation" -> ImmunizationEvaluation.serializer()
    "ImmunizationRecommendation" -> ImmunizationRecommendation.serializer()
    "ImplementationGuide" -> ImplementationGuide.serializer()
    "Ingredient" -> Ingredient.serializer()
    "InsurancePlan" -> InsurancePlan.serializer()
    "Invoice" -> Invoice.serializer()
    "Library" -> Library.serializer()
    "Linkage" -> Linkage.serializer()
    "Location" -> Location.serializer()
    "ManufacturedItemDefinition" -> ManufacturedItemDefinition.serializer()
    "Measure" -> Measure.serializer()
    "MeasureReport" -> MeasureReport.serializer()
    "Media" -> Media.serializer()
    "Medication" -> Medication.serializer()
    "MedicationAdministration" -> MedicationAdministration.serializer()
    "MedicationDispense" -> MedicationDispense.serializer()
    "MedicationKnowledge" -> MedicationKnowledge.serializer()
    "MedicationRequest" -> MedicationRequest.serializer()
    "MedicationStatement" -> MedicationStatement.serializer()
    "MedicinalProductDefinition" -> MedicinalProductDefinition.serializer()
    "MessageDefinition" -> MessageDefinition.serializer()
    "MessageHeader" -> MessageHeader.serializer()
    "MolecularSequence" -> MolecularSequence.serializer()
    "NamingSystem" -> NamingSystem.serializer()
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
    "RequestGroup" -> RequestGroup.serializer()
    "ResearchDefinition" -> ResearchDefinition.serializer()
    "ResearchElementDefinition" -> ResearchElementDefinition.serializer()
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
    "SupplyDelivery" -> SupplyDelivery.serializer()
    "SupplyRequest" -> SupplyRequest.serializer()
    "Task" -> Task.serializer()
    "TerminologyCapabilities" -> TerminologyCapabilities.serializer()
    "TestReport" -> TestReport.serializer()
    "TestScript" -> TestScript.serializer()
    "ValueSet" -> ValueSet.serializer()
    "VerificationResult" -> VerificationResult.serializer()
    "VisionPrescription" -> VisionPrescription.serializer()
    else -> error("Unknown Resource type: $serialName")
  }

  override fun getSerializerByClass(kclass: KClass<out Resource>): KSerializer<out Resource> = when
      (kclass) {
    Account::class -> Account.serializer()
    ActivityDefinition::class -> ActivityDefinition.serializer()
    AdministrableProductDefinition::class -> AdministrableProductDefinition.serializer()
    AdverseEvent::class -> AdverseEvent.serializer()
    AllergyIntolerance::class -> AllergyIntolerance.serializer()
    Appointment::class -> Appointment.serializer()
    AppointmentResponse::class -> AppointmentResponse.serializer()
    AuditEvent::class -> AuditEvent.serializer()
    Basic::class -> Basic.serializer()
    Binary::class -> Binary.serializer()
    BiologicallyDerivedProduct::class -> BiologicallyDerivedProduct.serializer()
    BodyStructure::class -> BodyStructure.serializer()
    Bundle::class -> Bundle.serializer()
    CapabilityStatement::class -> CapabilityStatement.serializer()
    CarePlan::class -> CarePlan.serializer()
    CareTeam::class -> CareTeam.serializer()
    CatalogEntry::class -> CatalogEntry.serializer()
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
    Consent::class -> Consent.serializer()
    Contract::class -> Contract.serializer()
    Coverage::class -> Coverage.serializer()
    CoverageEligibilityRequest::class -> CoverageEligibilityRequest.serializer()
    CoverageEligibilityResponse::class -> CoverageEligibilityResponse.serializer()
    DetectedIssue::class -> DetectedIssue.serializer()
    Device::class -> Device.serializer()
    DeviceDefinition::class -> DeviceDefinition.serializer()
    DeviceMetric::class -> DeviceMetric.serializer()
    DeviceRequest::class -> DeviceRequest.serializer()
    DeviceUseStatement::class -> DeviceUseStatement.serializer()
    DiagnosticReport::class -> DiagnosticReport.serializer()
    DocumentManifest::class -> DocumentManifest.serializer()
    DocumentReference::class -> DocumentReference.serializer()
    Encounter::class -> Encounter.serializer()
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
    Goal::class -> Goal.serializer()
    GraphDefinition::class -> GraphDefinition.serializer()
    Group::class -> Group.serializer()
    GuidanceResponse::class -> GuidanceResponse.serializer()
    HealthcareService::class -> HealthcareService.serializer()
    ImagingStudy::class -> ImagingStudy.serializer()
    Immunization::class -> Immunization.serializer()
    ImmunizationEvaluation::class -> ImmunizationEvaluation.serializer()
    ImmunizationRecommendation::class -> ImmunizationRecommendation.serializer()
    ImplementationGuide::class -> ImplementationGuide.serializer()
    Ingredient::class -> Ingredient.serializer()
    InsurancePlan::class -> InsurancePlan.serializer()
    Invoice::class -> Invoice.serializer()
    Library::class -> Library.serializer()
    Linkage::class -> Linkage.serializer()
    Location::class -> Location.serializer()
    ManufacturedItemDefinition::class -> ManufacturedItemDefinition.serializer()
    Measure::class -> Measure.serializer()
    MeasureReport::class -> MeasureReport.serializer()
    Media::class -> Media.serializer()
    Medication::class -> Medication.serializer()
    MedicationAdministration::class -> MedicationAdministration.serializer()
    MedicationDispense::class -> MedicationDispense.serializer()
    MedicationKnowledge::class -> MedicationKnowledge.serializer()
    MedicationRequest::class -> MedicationRequest.serializer()
    MedicationStatement::class -> MedicationStatement.serializer()
    MedicinalProductDefinition::class -> MedicinalProductDefinition.serializer()
    MessageDefinition::class -> MessageDefinition.serializer()
    MessageHeader::class -> MessageHeader.serializer()
    MolecularSequence::class -> MolecularSequence.serializer()
    NamingSystem::class -> NamingSystem.serializer()
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
    RequestGroup::class -> RequestGroup.serializer()
    ResearchDefinition::class -> ResearchDefinition.serializer()
    ResearchElementDefinition::class -> ResearchElementDefinition.serializer()
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
    SupplyDelivery::class -> SupplyDelivery.serializer()
    SupplyRequest::class -> SupplyRequest.serializer()
    Task::class -> Task.serializer()
    TerminologyCapabilities::class -> TerminologyCapabilities.serializer()
    TestReport::class -> TestReport.serializer()
    TestScript::class -> TestScript.serializer()
    ValueSet::class -> ValueSet.serializer()
    VerificationResult::class -> VerificationResult.serializer()
    VisionPrescription::class -> VisionPrescription.serializer()
    else -> error("Unknown resource type: $kclass")
  }
}
