//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.`annotation`

import io.icure.fhir.mapping.domain.fhir.r4b.Element
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Text node with attribution
 *
 * A  text note which also  contains information about who made the statement and when.
 *
 * @param id Unique id for inter-element referencing
 * @param authorReference Individual responsible for the annotation
 * @param authorString Individual responsible for the annotation
 * @param time When the annotation was made
 * @param text The annotation  - text content (as markdown)
 */
@SerialName("Annotation")
@Serializable
public data class Annotation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Individual responsible for the annotation
   */
  public val authorReference: Reference? = null,
  /**
   * Individual responsible for the annotation
   */
  public val authorString: String? = null,
  /**
   * When the annotation was made
   */
  public val time: String? = null,
  /**
   * The annotation  - text content (as markdown)
   */
  public val text: String? = null,
) : Element
