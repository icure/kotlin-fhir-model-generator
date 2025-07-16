//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.relatedartifact

import io.icure.fhir.mapping.domain.fhir.r5.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.datatype.DataType
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Related artifacts for a knowledge resource
 *
 * Related artifacts such as additional documentation, justification, or bibliographic references.
 *
 * @param id Unique id for inter-element referencing
 * @param type documentation | justification | citation | predecessor | successor | derived-from |
 * depends-on | composed-of | part-of | amends | amended-with | appends | appended-with | cites |
 * cited-by | comments-on | comment-in | contains | contained-in | corrects | correction-in | replaces
 * | replaced-with | retracts | retracted-by | signs | similar-to | supports | supported-with |
 * transforms | transformed-into | transformed-with | documents | specification-of | created-with |
 * cite-as
 * @param label Short label
 * @param display Brief description of the related artifact
 * @param citation Bibliographic citation for the artifact
 * @param document What document is being referenced
 * @param resource What artifact is being referenced
 * @param resourceReference What artifact, if not a conformance resource
 * @param publicationStatus draft | active | retired | unknown
 * @param publicationDate Date of publication of the artifact being referred to
 */
@SerialName("RelatedArtifact")
@Serializable
public data class RelatedArtifact(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * documentation | justification | citation | predecessor | successor | derived-from | depends-on
   * | composed-of | part-of | amends | amended-with | appends | appended-with | cites | cited-by |
   * comments-on | comment-in | contains | contained-in | corrects | correction-in | replaces |
   * replaced-with | retracts | retracted-by | signs | similar-to | supports | supported-with |
   * transforms | transformed-into | transformed-with | documents | specification-of | created-with |
   * cite-as
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
  /**
   * draft | active | retired | unknown
   */
  public val publicationStatus: String? = null,
  /**
   * Date of publication of the artifact being referred to
   */
  public val publicationDate: String? = null,
) : DataType
