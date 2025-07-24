//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.medication

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Definition of a Medication
 *
 * This resource is primarily used for the identification and definition of a medication, including
 * ingredients, for the purposes of prescribing, dispensing, and administering a medication as well as
 * for making statements about medication use.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param code Codes that identify this medication
 * @param status active | inactive | entered-in-error
 * @param marketingAuthorizationHolder Organization that has authorization to market medication
 * @param doseForm powder | tablets | capsule +
 * @param totalVolume When the specified product code does not infer a package size, this is the
 * specific amount of drug in the product
 * @param batch Details about packaged medications
 * @param definition Knowledge about this medication
 */
@SerialName("Medication")
@Serializable
public data class Medication(
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
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Codes that identify this medication
   */
  public val code: CodeableConcept? = null,
  /**
   * active | inactive | entered-in-error
   */
  public val status: String? = null,
  /**
   * Organization that has authorization to market medication
   */
  public val marketingAuthorizationHolder: Reference? = null,
  /**
   * powder | tablets | capsule +
   */
  public val doseForm: CodeableConcept? = null,
  /**
   * When the specified product code does not infer a package size, this is the specific amount of
   * drug in the product
   */
  public val totalVolume: Quantity? = null,
  public val ingredient: List<MedicationIngredient> = emptyList(),
  /**
   * Details about packaged medications
   */
  public val batch: MedicationBatch? = null,
  /**
   * Knowledge about this medication
   */
  public val definition: Reference? = null,
) : DomainResource
