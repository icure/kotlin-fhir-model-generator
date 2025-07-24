//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.molecularsequence

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Representation of a molecular sequence
 *
 * Representation of a molecular sequence.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param type aa | dna | rna
 * @param subject Subject this sequence is associated too
 * @param specimen Specimen used for sequencing
 * @param device The method for sequencing
 * @param performer Who should be responsible for test result
 * @param literal Sequence that was observed
 */
@SerialName("MolecularSequence")
@Serializable
public data class MolecularSequence(
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
   * aa | dna | rna
   */
  public val type: String? = null,
  /**
   * Subject this sequence is associated too
   */
  public val subject: Reference? = null,
  public val focus: List<Reference> = emptyList(),
  /**
   * Specimen used for sequencing
   */
  public val specimen: Reference? = null,
  /**
   * The method for sequencing
   */
  public val device: Reference? = null,
  /**
   * Who should be responsible for test result
   */
  public val performer: Reference? = null,
  /**
   * Sequence that was observed
   */
  public val literal: String? = null,
  public val formatted: List<Attachment> = emptyList(),
  public val relative: List<MolecularSequenceRelative> = emptyList(),
) : DomainResource
