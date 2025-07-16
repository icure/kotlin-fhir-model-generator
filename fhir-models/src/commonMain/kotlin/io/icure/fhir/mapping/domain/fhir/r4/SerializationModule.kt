package io.icure.fhir.mapping.domain.fhir.r4

import io.icure.fhir.mapping.domain.fhir.CustomJsonPolymorphicSerializer
import io.icure.fhir.mapping.domain.fhir.r4.account.Account
import io.icure.fhir.mapping.domain.fhir.r4.activitydefinition.ActivityDefinition
import io.icure.fhir.mapping.domain.fhir.r4.adverseevent.AdverseEvent
import io.icure.fhir.mapping.domain.fhir.r4.age.Age
import io.icure.fhir.mapping.domain.fhir.r4.allergyintolerance.AllergyIntolerance
import io.icure.fhir.mapping.domain.fhir.r4.appointment.Appointment
import io.icure.fhir.mapping.domain.fhir.r4.appointmentresponse.AppointmentResponse
import io.icure.fhir.mapping.domain.fhir.r4.auditevent.AuditEvent
import io.icure.fhir.mapping.domain.fhir.r4.basic.Basic
import io.icure.fhir.mapping.domain.fhir.r4.binary.Binary
import io.icure.fhir.mapping.domain.fhir.r4.biologicallyderivedproduct.BiologicallyDerivedProduct
import io.icure.fhir.mapping.domain.fhir.r4.bodystructure.BodyStructure
import io.icure.fhir.mapping.domain.fhir.r4.bundle.Bundle
import io.icure.fhir.mapping.domain.fhir.r4.capabilitystatement.CapabilityStatement
import io.icure.fhir.mapping.domain.fhir.r4.careplan.CarePlan
import io.icure.fhir.mapping.domain.fhir.r4.careteam.CareTeam
import io.icure.fhir.mapping.domain.fhir.r4.catalogentry.CatalogEntry
import io.icure.fhir.mapping.domain.fhir.r4.chargeitem.ChargeItem
import io.icure.fhir.mapping.domain.fhir.r4.chargeitemdefinition.ChargeItemDefinition
import io.icure.fhir.mapping.domain.fhir.r4.claim.Claim
import io.icure.fhir.mapping.domain.fhir.r4.claimresponse.ClaimResponse
import io.icure.fhir.mapping.domain.fhir.r4.clinicalimpression.ClinicalImpression
import io.icure.fhir.mapping.domain.fhir.r4.codesystem.CodeSystem
import io.icure.fhir.mapping.domain.fhir.r4.communication.Communication
import io.icure.fhir.mapping.domain.fhir.r4.communicationrequest.CommunicationRequest
import io.icure.fhir.mapping.domain.fhir.r4.compartmentdefinition.CompartmentDefinition
import io.icure.fhir.mapping.domain.fhir.r4.composition.Composition
import io.icure.fhir.mapping.domain.fhir.r4.conceptmap.ConceptMap
import io.icure.fhir.mapping.domain.fhir.r4.condition.Condition
import io.icure.fhir.mapping.domain.fhir.r4.consent.Consent
import io.icure.fhir.mapping.domain.fhir.r4.contract.Contract
import io.icure.fhir.mapping.domain.fhir.r4.count.Count
import io.icure.fhir.mapping.domain.fhir.r4.coverage.Coverage
import io.icure.fhir.mapping.domain.fhir.r4.coverageeligibilityrequest.CoverageEligibilityRequest
import io.icure.fhir.mapping.domain.fhir.r4.coverageeligibilityresponse.CoverageEligibilityResponse
import io.icure.fhir.mapping.domain.fhir.r4.detectedissue.DetectedIssue
import io.icure.fhir.mapping.domain.fhir.r4.device.Device
import io.icure.fhir.mapping.domain.fhir.r4.devicedefinition.DeviceDefinition
import io.icure.fhir.mapping.domain.fhir.r4.devicemetric.DeviceMetric
import io.icure.fhir.mapping.domain.fhir.r4.devicerequest.DeviceRequest
import io.icure.fhir.mapping.domain.fhir.r4.deviceusestatement.DeviceUseStatement
import io.icure.fhir.mapping.domain.fhir.r4.diagnosticreport.DiagnosticReport
import io.icure.fhir.mapping.domain.fhir.r4.distance.Distance
import io.icure.fhir.mapping.domain.fhir.r4.documentmanifest.DocumentManifest
import io.icure.fhir.mapping.domain.fhir.r4.documentreference.DocumentReference
import io.icure.fhir.mapping.domain.fhir.r4.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r4.effectevidencesynthesis.EffectEvidenceSynthesis
import io.icure.fhir.mapping.domain.fhir.r4.encounter.Encounter
import io.icure.fhir.mapping.domain.fhir.r4.endpoint.Endpoint
import io.icure.fhir.mapping.domain.fhir.r4.enrollmentrequest.EnrollmentRequest
import io.icure.fhir.mapping.domain.fhir.r4.enrollmentresponse.EnrollmentResponse
import io.icure.fhir.mapping.domain.fhir.r4.episodeofcare.EpisodeOfCare
import io.icure.fhir.mapping.domain.fhir.r4.eventdefinition.EventDefinition
import io.icure.fhir.mapping.domain.fhir.r4.evidence.Evidence
import io.icure.fhir.mapping.domain.fhir.r4.evidencevariable.EvidenceVariable
import io.icure.fhir.mapping.domain.fhir.r4.examplescenario.ExampleScenario
import io.icure.fhir.mapping.domain.fhir.r4.explanationofbenefit.ExplanationOfBenefit
import io.icure.fhir.mapping.domain.fhir.r4.familymemberhistory.FamilyMemberHistory
import io.icure.fhir.mapping.domain.fhir.r4.flag.Flag
import io.icure.fhir.mapping.domain.fhir.r4.goal.Goal
import io.icure.fhir.mapping.domain.fhir.r4.graphdefinition.GraphDefinition
import io.icure.fhir.mapping.domain.fhir.r4.group.Group
import io.icure.fhir.mapping.domain.fhir.r4.guidanceresponse.GuidanceResponse
import io.icure.fhir.mapping.domain.fhir.r4.healthcareservice.HealthcareService
import io.icure.fhir.mapping.domain.fhir.r4.imagingstudy.ImagingStudy
import io.icure.fhir.mapping.domain.fhir.r4.immunization.Immunization
import io.icure.fhir.mapping.domain.fhir.r4.immunizationevaluation.ImmunizationEvaluation
import io.icure.fhir.mapping.domain.fhir.r4.immunizationrecommendation.ImmunizationRecommendation
import io.icure.fhir.mapping.domain.fhir.r4.implementationguide.ImplementationGuide
import io.icure.fhir.mapping.domain.fhir.r4.insuranceplan.InsurancePlan
import io.icure.fhir.mapping.domain.fhir.r4.invoice.Invoice
import io.icure.fhir.mapping.domain.fhir.r4.library.Library
import io.icure.fhir.mapping.domain.fhir.r4.linkage.Linkage
import io.icure.fhir.mapping.domain.fhir.r4.location.Location
import io.icure.fhir.mapping.domain.fhir.r4.measure.Measure
import io.icure.fhir.mapping.domain.fhir.r4.measurereport.MeasureReport
import io.icure.fhir.mapping.domain.fhir.r4.media.Media
import io.icure.fhir.mapping.domain.fhir.r4.medication.Medication
import io.icure.fhir.mapping.domain.fhir.r4.medicationadministration.MedicationAdministration
import io.icure.fhir.mapping.domain.fhir.r4.medicationdispense.MedicationDispense
import io.icure.fhir.mapping.domain.fhir.r4.medicationknowledge.MedicationKnowledge
import io.icure.fhir.mapping.domain.fhir.r4.medicationrequest.MedicationRequest
import io.icure.fhir.mapping.domain.fhir.r4.medicationstatement.MedicationStatement
import io.icure.fhir.mapping.domain.fhir.r4.medicinalproduct.MedicinalProduct
import io.icure.fhir.mapping.domain.fhir.r4.medicinalproductauthorization.MedicinalProductAuthorization
import io.icure.fhir.mapping.domain.fhir.r4.medicinalproductcontraindication.MedicinalProductContraindication
import io.icure.fhir.mapping.domain.fhir.r4.medicinalproductindication.MedicinalProductIndication
import io.icure.fhir.mapping.domain.fhir.r4.medicinalproductingredient.MedicinalProductIngredient
import io.icure.fhir.mapping.domain.fhir.r4.medicinalproductinteraction.MedicinalProductInteraction
import io.icure.fhir.mapping.domain.fhir.r4.medicinalproductmanufactured.MedicinalProductManufactured
import io.icure.fhir.mapping.domain.fhir.r4.medicinalproductpackaged.MedicinalProductPackaged
import io.icure.fhir.mapping.domain.fhir.r4.medicinalproductpharmaceutical.MedicinalProductPharmaceutical
import io.icure.fhir.mapping.domain.fhir.r4.medicinalproductundesirableeffect.MedicinalProductUndesirableEffect
import io.icure.fhir.mapping.domain.fhir.r4.messagedefinition.MessageDefinition
import io.icure.fhir.mapping.domain.fhir.r4.messageheader.MessageHeader
import io.icure.fhir.mapping.domain.fhir.r4.metadataresource.MetadataResource
import io.icure.fhir.mapping.domain.fhir.r4.molecularsequence.MolecularSequence
import io.icure.fhir.mapping.domain.fhir.r4.namingsystem.NamingSystem
import io.icure.fhir.mapping.domain.fhir.r4.nutritionorder.NutritionOrder
import io.icure.fhir.mapping.domain.fhir.r4.observation.Observation
import io.icure.fhir.mapping.domain.fhir.r4.observationdefinition.ObservationDefinition
import io.icure.fhir.mapping.domain.fhir.r4.operationdefinition.OperationDefinition
import io.icure.fhir.mapping.domain.fhir.r4.operationoutcome.OperationOutcome
import io.icure.fhir.mapping.domain.fhir.r4.organization.Organization
import io.icure.fhir.mapping.domain.fhir.r4.organizationaffiliation.OrganizationAffiliation
import io.icure.fhir.mapping.domain.fhir.r4.parameters.Parameters
import io.icure.fhir.mapping.domain.fhir.r4.patient.Patient
import io.icure.fhir.mapping.domain.fhir.r4.paymentnotice.PaymentNotice
import io.icure.fhir.mapping.domain.fhir.r4.paymentreconciliation.PaymentReconciliation
import io.icure.fhir.mapping.domain.fhir.r4.person.Person
import io.icure.fhir.mapping.domain.fhir.r4.plandefinition.PlanDefinition
import io.icure.fhir.mapping.domain.fhir.r4.practitioner.Practitioner
import io.icure.fhir.mapping.domain.fhir.r4.practitionerrole.PractitionerRole
import io.icure.fhir.mapping.domain.fhir.r4.procedure.Procedure
import io.icure.fhir.mapping.domain.fhir.r4.provenance.Provenance
import io.icure.fhir.mapping.domain.fhir.r4.questionnaire.Questionnaire
import io.icure.fhir.mapping.domain.fhir.r4.questionnaireresponse.QuestionnaireResponse
import io.icure.fhir.mapping.domain.fhir.r4.relatedperson.RelatedPerson
import io.icure.fhir.mapping.domain.fhir.r4.requestgroup.RequestGroup
import io.icure.fhir.mapping.domain.fhir.r4.researchdefinition.ResearchDefinition
import io.icure.fhir.mapping.domain.fhir.r4.researchelementdefinition.ResearchElementDefinition
import io.icure.fhir.mapping.domain.fhir.r4.researchstudy.ResearchStudy
import io.icure.fhir.mapping.domain.fhir.r4.researchsubject.ResearchSubject
import io.icure.fhir.mapping.domain.fhir.r4.riskassessment.RiskAssessment
import io.icure.fhir.mapping.domain.fhir.r4.riskevidencesynthesis.RiskEvidenceSynthesis
import io.icure.fhir.mapping.domain.fhir.r4.schedule.Schedule
import io.icure.fhir.mapping.domain.fhir.r4.searchparameter.SearchParameter
import io.icure.fhir.mapping.domain.fhir.r4.servicerequest.ServiceRequest
import io.icure.fhir.mapping.domain.fhir.r4.slot.Slot
import io.icure.fhir.mapping.domain.fhir.r4.specimen.Specimen
import io.icure.fhir.mapping.domain.fhir.r4.specimendefinition.SpecimenDefinition
import io.icure.fhir.mapping.domain.fhir.r4.structuredefinition.StructureDefinition
import io.icure.fhir.mapping.domain.fhir.r4.structuremap.StructureMap
import io.icure.fhir.mapping.domain.fhir.r4.subscription.Subscription
import io.icure.fhir.mapping.domain.fhir.r4.substance.Substance
import io.icure.fhir.mapping.domain.fhir.r4.substancenucleicacid.SubstanceNucleicAcid
import io.icure.fhir.mapping.domain.fhir.r4.substancepolymer.SubstancePolymer
import io.icure.fhir.mapping.domain.fhir.r4.substanceprotein.SubstanceProtein
import io.icure.fhir.mapping.domain.fhir.r4.substancereferenceinformation.SubstanceReferenceInformation
import io.icure.fhir.mapping.domain.fhir.r4.substancesourcematerial.SubstanceSourceMaterial
import io.icure.fhir.mapping.domain.fhir.r4.substancespecification.SubstanceSpecification
import io.icure.fhir.mapping.domain.fhir.r4.supplydelivery.SupplyDelivery
import io.icure.fhir.mapping.domain.fhir.r4.supplyrequest.SupplyRequest
import io.icure.fhir.mapping.domain.fhir.r4.task.Task
import io.icure.fhir.mapping.domain.fhir.r4.terminologycapabilities.TerminologyCapabilities
import io.icure.fhir.mapping.domain.fhir.r4.testreport.TestReport
import io.icure.fhir.mapping.domain.fhir.r4.testscript.TestScript
import io.icure.fhir.mapping.domain.fhir.r4.valueset.ValueSet
import io.icure.fhir.mapping.domain.fhir.r4.verificationresult.VerificationResult
import io.icure.fhir.mapping.domain.fhir.r4.visionprescription.VisionPrescription
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KClass
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object QuantitySerializer : KSerializer<Quantity> {
  override val descriptor: SerialDescriptor =
      io.icure.fhir.mapping.domain.fhir.r4.quantity.Quantity.serializer().descriptor


  override fun deserialize(decoder: Decoder): Quantity =
      decoder.decodeSerializableValue(io.icure.fhir.mapping.domain.fhir.r4.quantity.Quantity.serializer())

  override fun serialize(encoder: Encoder, `value`: Quantity): Unit = when (value) {
    is Age -> Age.serializer().serialize(encoder, value)
    is Count -> Count.serializer().serialize(encoder, value)
    is Distance -> Distance.serializer().serialize(encoder, value)
    is Duration -> Duration.serializer().serialize(encoder, value)
    is io.icure.fhir.mapping.domain.fhir.r4.quantity.Quantity ->
        io.icure.fhir.mapping.domain.fhir.r4.quantity.Quantity.serializer().serialize(encoder,
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
    "Claim" -> Claim.serializer()
    "ClaimResponse" -> ClaimResponse.serializer()
    "ClinicalImpression" -> ClinicalImpression.serializer()
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
    "EffectEvidenceSynthesis" -> EffectEvidenceSynthesis.serializer()
    "Encounter" -> Encounter.serializer()
    "Endpoint" -> Endpoint.serializer()
    "EnrollmentRequest" -> EnrollmentRequest.serializer()
    "EnrollmentResponse" -> EnrollmentResponse.serializer()
    "EpisodeOfCare" -> EpisodeOfCare.serializer()
    "EventDefinition" -> EventDefinition.serializer()
    "Evidence" -> Evidence.serializer()
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
    "InsurancePlan" -> InsurancePlan.serializer()
    "Invoice" -> Invoice.serializer()
    "Library" -> Library.serializer()
    "Linkage" -> Linkage.serializer()
    "Location" -> Location.serializer()
    "Measure" -> Measure.serializer()
    "MeasureReport" -> MeasureReport.serializer()
    "Media" -> Media.serializer()
    "Medication" -> Medication.serializer()
    "MedicationAdministration" -> MedicationAdministration.serializer()
    "MedicationDispense" -> MedicationDispense.serializer()
    "MedicationKnowledge" -> MedicationKnowledge.serializer()
    "MedicationRequest" -> MedicationRequest.serializer()
    "MedicationStatement" -> MedicationStatement.serializer()
    "MedicinalProduct" -> MedicinalProduct.serializer()
    "MedicinalProductAuthorization" -> MedicinalProductAuthorization.serializer()
    "MedicinalProductContraindication" -> MedicinalProductContraindication.serializer()
    "MedicinalProductIndication" -> MedicinalProductIndication.serializer()
    "MedicinalProductIngredient" -> MedicinalProductIngredient.serializer()
    "MedicinalProductInteraction" -> MedicinalProductInteraction.serializer()
    "MedicinalProductManufactured" -> MedicinalProductManufactured.serializer()
    "MedicinalProductPackaged" -> MedicinalProductPackaged.serializer()
    "MedicinalProductPharmaceutical" -> MedicinalProductPharmaceutical.serializer()
    "MedicinalProductUndesirableEffect" -> MedicinalProductUndesirableEffect.serializer()
    "MessageDefinition" -> MessageDefinition.serializer()
    "MessageHeader" -> MessageHeader.serializer()
    "MetadataResource" -> MetadataResource.serializer()
    "MolecularSequence" -> MolecularSequence.serializer()
    "NamingSystem" -> NamingSystem.serializer()
    "NutritionOrder" -> NutritionOrder.serializer()
    "Observation" -> Observation.serializer()
    "ObservationDefinition" -> ObservationDefinition.serializer()
    "OperationDefinition" -> OperationDefinition.serializer()
    "OperationOutcome" -> OperationOutcome.serializer()
    "Organization" -> Organization.serializer()
    "OrganizationAffiliation" -> OrganizationAffiliation.serializer()
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
    "RelatedPerson" -> RelatedPerson.serializer()
    "RequestGroup" -> RequestGroup.serializer()
    "ResearchDefinition" -> ResearchDefinition.serializer()
    "ResearchElementDefinition" -> ResearchElementDefinition.serializer()
    "ResearchStudy" -> ResearchStudy.serializer()
    "ResearchSubject" -> ResearchSubject.serializer()
    "RiskAssessment" -> RiskAssessment.serializer()
    "RiskEvidenceSynthesis" -> RiskEvidenceSynthesis.serializer()
    "Schedule" -> Schedule.serializer()
    "SearchParameter" -> SearchParameter.serializer()
    "ServiceRequest" -> ServiceRequest.serializer()
    "Slot" -> Slot.serializer()
    "Specimen" -> Specimen.serializer()
    "SpecimenDefinition" -> SpecimenDefinition.serializer()
    "StructureDefinition" -> StructureDefinition.serializer()
    "StructureMap" -> StructureMap.serializer()
    "Subscription" -> Subscription.serializer()
    "Substance" -> Substance.serializer()
    "SubstanceNucleicAcid" -> SubstanceNucleicAcid.serializer()
    "SubstancePolymer" -> SubstancePolymer.serializer()
    "SubstanceProtein" -> SubstanceProtein.serializer()
    "SubstanceReferenceInformation" -> SubstanceReferenceInformation.serializer()
    "SubstanceSourceMaterial" -> SubstanceSourceMaterial.serializer()
    "SubstanceSpecification" -> SubstanceSpecification.serializer()
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
    Claim::class -> Claim.serializer()
    ClaimResponse::class -> ClaimResponse.serializer()
    ClinicalImpression::class -> ClinicalImpression.serializer()
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
    EffectEvidenceSynthesis::class -> EffectEvidenceSynthesis.serializer()
    Encounter::class -> Encounter.serializer()
    Endpoint::class -> Endpoint.serializer()
    EnrollmentRequest::class -> EnrollmentRequest.serializer()
    EnrollmentResponse::class -> EnrollmentResponse.serializer()
    EpisodeOfCare::class -> EpisodeOfCare.serializer()
    EventDefinition::class -> EventDefinition.serializer()
    Evidence::class -> Evidence.serializer()
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
    InsurancePlan::class -> InsurancePlan.serializer()
    Invoice::class -> Invoice.serializer()
    Library::class -> Library.serializer()
    Linkage::class -> Linkage.serializer()
    Location::class -> Location.serializer()
    Measure::class -> Measure.serializer()
    MeasureReport::class -> MeasureReport.serializer()
    Media::class -> Media.serializer()
    Medication::class -> Medication.serializer()
    MedicationAdministration::class -> MedicationAdministration.serializer()
    MedicationDispense::class -> MedicationDispense.serializer()
    MedicationKnowledge::class -> MedicationKnowledge.serializer()
    MedicationRequest::class -> MedicationRequest.serializer()
    MedicationStatement::class -> MedicationStatement.serializer()
    MedicinalProduct::class -> MedicinalProduct.serializer()
    MedicinalProductAuthorization::class -> MedicinalProductAuthorization.serializer()
    MedicinalProductContraindication::class -> MedicinalProductContraindication.serializer()
    MedicinalProductIndication::class -> MedicinalProductIndication.serializer()
    MedicinalProductIngredient::class -> MedicinalProductIngredient.serializer()
    MedicinalProductInteraction::class -> MedicinalProductInteraction.serializer()
    MedicinalProductManufactured::class -> MedicinalProductManufactured.serializer()
    MedicinalProductPackaged::class -> MedicinalProductPackaged.serializer()
    MedicinalProductPharmaceutical::class -> MedicinalProductPharmaceutical.serializer()
    MedicinalProductUndesirableEffect::class -> MedicinalProductUndesirableEffect.serializer()
    MessageDefinition::class -> MessageDefinition.serializer()
    MessageHeader::class -> MessageHeader.serializer()
    MetadataResource::class -> MetadataResource.serializer()
    MolecularSequence::class -> MolecularSequence.serializer()
    NamingSystem::class -> NamingSystem.serializer()
    NutritionOrder::class -> NutritionOrder.serializer()
    Observation::class -> Observation.serializer()
    ObservationDefinition::class -> ObservationDefinition.serializer()
    OperationDefinition::class -> OperationDefinition.serializer()
    OperationOutcome::class -> OperationOutcome.serializer()
    Organization::class -> Organization.serializer()
    OrganizationAffiliation::class -> OrganizationAffiliation.serializer()
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
    RelatedPerson::class -> RelatedPerson.serializer()
    RequestGroup::class -> RequestGroup.serializer()
    ResearchDefinition::class -> ResearchDefinition.serializer()
    ResearchElementDefinition::class -> ResearchElementDefinition.serializer()
    ResearchStudy::class -> ResearchStudy.serializer()
    ResearchSubject::class -> ResearchSubject.serializer()
    RiskAssessment::class -> RiskAssessment.serializer()
    RiskEvidenceSynthesis::class -> RiskEvidenceSynthesis.serializer()
    Schedule::class -> Schedule.serializer()
    SearchParameter::class -> SearchParameter.serializer()
    ServiceRequest::class -> ServiceRequest.serializer()
    Slot::class -> Slot.serializer()
    Specimen::class -> Specimen.serializer()
    SpecimenDefinition::class -> SpecimenDefinition.serializer()
    StructureDefinition::class -> StructureDefinition.serializer()
    StructureMap::class -> StructureMap.serializer()
    Subscription::class -> Subscription.serializer()
    Substance::class -> Substance.serializer()
    SubstanceNucleicAcid::class -> SubstanceNucleicAcid.serializer()
    SubstancePolymer::class -> SubstancePolymer.serializer()
    SubstanceProtein::class -> SubstanceProtein.serializer()
    SubstanceReferenceInformation::class -> SubstanceReferenceInformation.serializer()
    SubstanceSourceMaterial::class -> SubstanceSourceMaterial.serializer()
    SubstanceSpecification::class -> SubstanceSpecification.serializer()
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
