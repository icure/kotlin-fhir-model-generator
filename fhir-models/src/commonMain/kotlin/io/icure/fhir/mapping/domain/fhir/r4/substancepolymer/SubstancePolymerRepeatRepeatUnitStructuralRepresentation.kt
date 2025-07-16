//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.substancepolymer

import io.icure.fhir.mapping.domain.fhir.r4.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Todo
 *
 * Todo.
 *
 * @param id Unique id for inter-element referencing
 * @param type Todo
 * @param representation Todo
 * @param attachment Todo
 */
@SerialName("SubstancePolymerRepeatRepeatUnitStructuralRepresentation")
@Serializable
public data class SubstancePolymerRepeatRepeatUnitStructuralRepresentation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Todo
   */
  public val type: CodeableConcept? = null,
  /**
   * Todo
   */
  public val representation: String? = null,
  /**
   * Todo
   */
  public val attachment: Attachment? = null,
) : BackboneElement
