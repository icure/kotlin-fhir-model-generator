//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.testreport

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A participant in the test execution, either the execution engine, a client, or a server
 *
 * A participant in the test execution, either the execution engine, a client, or a server.
 *
 * @param id Unique id for inter-element referencing
 * @param type test-engine | client | server
 * @param uri The uri of the participant. An absolute URL is preferred
 * @param display The display name of the participant
 */
@SerialName("TestReportParticipant")
@Serializable
public data class TestReportParticipant(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * test-engine | client | server
   */
  public val type: String? = null,
  /**
   * The uri of the participant. An absolute URL is preferred
   */
  public val uri: String? = null,
  /**
   * The display name of the participant
   */
  public val display: String? = null,
) : BackboneElement
