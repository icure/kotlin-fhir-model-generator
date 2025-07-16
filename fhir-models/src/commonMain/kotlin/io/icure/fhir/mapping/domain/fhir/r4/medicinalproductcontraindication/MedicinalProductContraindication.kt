//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.medicinalproductcontraindication

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4.population.Population
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * MedicinalProductContraindication
 *
 * The clinical particulars - indications, contraindications etc. of a medicinal product, including
 * for regulatory purposes.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param disease The disease, symptom or procedure for the contraindication
 * @param diseaseStatus The status of the disease or symptom for the contraindication
 */
@SerialName("MedicinalProductContraindication")
@Serializable
public data class MedicinalProductContraindication(
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
   * The disease, symptom or procedure for the contraindication
   */
  public val disease: CodeableConcept? = null,
  /**
   * The status of the disease or symptom for the contraindication
   */
  public val diseaseStatus: CodeableConcept? = null,
  public val comorbidity: List<CodeableConcept> = emptyList(),
  public val therapeuticIndication: List<Reference> = emptyList(),
  public val otherTherapy: List<MedicinalProductContraindicationOtherTherapy> = emptyList(),
  public val population: List<Population> = emptyList(),
) : DomainResource
