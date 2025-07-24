//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.medicinalproductindication

import com.icure.fhir.mapping.domain.fhir.r4.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Quantity
import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4.population.Population
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * MedicinalProductIndication
 *
 * Indication for the Medicinal Product.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param diseaseSymptomProcedure The disease, symptom or procedure that is the indication for
 * treatment
 * @param diseaseStatus The status of the disease or symptom for which the indication applies
 * @param intendedEffect The intended effect, aim or strategy to be achieved by the indication
 * @param duration Timing or duration information as part of the indication
 */
@SerialName("MedicinalProductIndication")
@Serializable
public data class MedicinalProductIndication(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val subject: List<Reference> = emptyList(),
  /**
   * The disease, symptom or procedure that is the indication for treatment
   */
  public val diseaseSymptomProcedure: CodeableConcept? = null,
  /**
   * The status of the disease or symptom for which the indication applies
   */
  public val diseaseStatus: CodeableConcept? = null,
  public val comorbidity: List<CodeableConcept> = emptyList(),
  /**
   * The intended effect, aim or strategy to be achieved by the indication
   */
  public val intendedEffect: CodeableConcept? = null,
  /**
   * Timing or duration information as part of the indication
   */
  public val duration: Quantity? = null,
  public val otherTherapy: List<MedicinalProductIndicationOtherTherapy> = emptyList(),
  public val undesirableEffect: List<Reference> = emptyList(),
  public val population: List<Population> = emptyList(),
) : DomainResource
