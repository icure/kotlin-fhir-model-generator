//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.documentreference

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Attests to accuracy of the document
 *
 * A participant who has authenticated the accuracy of the document.
 *
 * @param id Unique id for inter-element referencing
 * @param mode personal | professional | legal | official
 * @param time When the document was attested
 * @param party Who attested the document
 */
@SerialName("DocumentReferenceAttester")
@Serializable
public data class DocumentReferenceAttester(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * personal | professional | legal | official
   */
  public val mode: CodeableConcept,
  /**
   * When the document was attested
   */
  public val time: String? = null,
  /**
   * Who attested the document
   */
  public val party: Reference? = null,
) : BackboneElement
