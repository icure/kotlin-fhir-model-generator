//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.citation

import com.icure.fhir.mapping.domain.fhir.r6.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The artifact related to the cited artifact
 *
 * The artifact related to the cited artifact.
 *
 * @param id Unique id for inter-element referencing
 * @param type documentation | justification | citation | predecessor | successor | derived-from |
 * depends-on | composed-of | part-of | amends | amended-with | appends | appended-with | cites |
 * cited-by | comments-on | comment-in | contains | contained-in | corrects | correction-in | replaces
 * | replaced-with | retracts | retracted-by | signs | similar-to | supports | supported-with |
 * transforms | transformed-into | transformed-with | documents | specification-of | created-with |
 * cite-as | reprint | reprint-of
 * @param label Short label
 * @param display Brief description of the related artifact
 * @param citation Bibliographic citation for the artifact
 * @param document What document is being referenced
 * @param resource What artifact is being referenced
 * @param resourceReference What artifact, if not a conformance resource
 */
@SerialName("CitationCitedArtifactRelatesTo")
@Serializable
public data class CitationCitedArtifactRelatesTo(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * documentation | justification | citation | predecessor | successor | derived-from | depends-on
   * | composed-of | part-of | amends | amended-with | appends | appended-with | cites | cited-by |
   * comments-on | comment-in | contains | contained-in | corrects | correction-in | replaces |
   * replaced-with | retracts | retracted-by | signs | similar-to | supports | supported-with |
   * transforms | transformed-into | transformed-with | documents | specification-of | created-with |
   * cite-as | reprint | reprint-of
   */
  public val type: String? = null,
  public val classifier: List<CodeableConcept> = emptyList(),
  /**
   * Short label
   */
  public val label: String? = null,
  /**
   * Brief description of the related artifact
   */
  public val display: String? = null,
  /**
   * Bibliographic citation for the artifact
   */
  public val citation: String? = null,
  /**
   * What document is being referenced
   */
  public val document: Attachment? = null,
  /**
   * What artifact is being referenced
   */
  public val resource: String? = null,
  /**
   * What artifact, if not a conformance resource
   */
  public val resourceReference: Reference? = null,
) : BackboneElement
