//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.clinicalusedefinition

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
 * @param treatment Reference to a specific medication, substance etc. as part of an indication or
 * contraindication
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
   * Reference to a specific medication, substance etc. as part of an indication or contraindication
   */
  public val treatment: CodeableReference,
) : BackboneElement
