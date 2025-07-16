//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.medicinalproductcontraindication

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information about the use of the medicinal product in relation to other therapies described as
 * part of the indication
 *
 * Information about the use of the medicinal product in relation to other therapies described as
 * part of the indication.
 *
 * @param id Unique id for inter-element referencing
 * @param therapyRelationshipType The type of relationship between the medicinal product indication
 * or contraindication and another therapy
 * @param medicationCodeableConcept Reference to a specific medication (active substance, medicinal
 * product or class of products) as part of an indication or contraindication
 * @param medicationReference Reference to a specific medication (active substance, medicinal
 * product or class of products) as part of an indication or contraindication
 */
@SerialName("MedicinalProductContraindicationOtherTherapy")
@Serializable
public data class MedicinalProductContraindicationOtherTherapy(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The type of relationship between the medicinal product indication or contraindication and
   * another therapy
   */
  public val therapyRelationshipType: CodeableConcept,
  /**
   * Reference to a specific medication (active substance, medicinal product or class of products)
   * as part of an indication or contraindication
   */
  public val medicationCodeableConcept: CodeableConcept? = null,
  /**
   * Reference to a specific medication (active substance, medicinal product or class of products)
   * as part of an indication or contraindication
   */
  public val medicationReference: Reference? = null,
) : BackboneElement
