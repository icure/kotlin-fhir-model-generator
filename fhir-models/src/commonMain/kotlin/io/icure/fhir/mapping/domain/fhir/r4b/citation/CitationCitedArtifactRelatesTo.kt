//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.citation

import io.icure.fhir.mapping.domain.fhir.r4b.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
 * @param relationshipType How the cited artifact relates to the target artifact
 * @param targetUri The article or artifact that the cited artifact is related to
 * @param targetIdentifier The article or artifact that the cited artifact is related to
 * @param targetReference The article or artifact that the cited artifact is related to
 * @param targetAttachment The article or artifact that the cited artifact is related to
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
   * How the cited artifact relates to the target artifact
   */
  public val relationshipType: CodeableConcept,
  public val targetClassifier: List<CodeableConcept> = emptyList(),
  /**
   * The article or artifact that the cited artifact is related to
   */
  public val targetUri: String? = null,
  /**
   * The article or artifact that the cited artifact is related to
   */
  public val targetIdentifier: Identifier? = null,
  /**
   * The article or artifact that the cited artifact is related to
   */
  public val targetReference: Reference? = null,
  /**
   * The article or artifact that the cited artifact is related to
   */
  public val targetAttachment: Attachment? = null,
) : BackboneElement
