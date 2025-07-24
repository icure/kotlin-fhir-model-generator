//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.clinicalusedefinition

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information about use of the product in relation to other therapies described as part of the
 * contraindication
 *
 * Information about the use of the medicinal product in relation to other therapies described as
 * part of the contraindication.
 *
 * @param id Unique id for inter-element referencing
 * @param relationshipType The type of relationship between the product indication/contraindication
 * and another therapy
 * @param therapy Reference to a specific medication as part of an indication or contraindication
 */
@SerialName("ClinicalUseDefinitionContraindicationOtherTherapy")
@Serializable
public data class ClinicalUseDefinitionContraindicationOtherTherapy(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The type of relationship between the product indication/contraindication and another therapy
   */
  public val relationshipType: CodeableConcept,
  /**
   * Reference to a specific medication as part of an indication or contraindication
   */
  public val therapy: CodeableReference,
) : BackboneElement
